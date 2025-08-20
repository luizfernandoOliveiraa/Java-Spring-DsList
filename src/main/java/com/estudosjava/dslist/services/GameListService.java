package com.estudosjava.dslist.services;

import com.estudosjava.dslist.dto.GameDTO;
import com.estudosjava.dslist.dto.GameListDTO;
import com.estudosjava.dslist.dto.GameMinDTO;
import com.estudosjava.dslist.entities.Game;
import com.estudosjava.dslist.entities.GameList;
import com.estudosjava.dslist.repositories.GameListRepository;
import com.estudosjava.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }

}
