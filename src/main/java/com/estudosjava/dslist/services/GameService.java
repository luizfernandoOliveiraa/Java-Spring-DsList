package com.estudosjava.dslist.services;

import com.estudosjava.dslist.dto.GameMinDTO;
import com.estudosjava.dslist.entities.Game;
import com.estudosjava.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
