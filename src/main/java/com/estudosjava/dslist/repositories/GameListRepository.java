package com.estudosjava.dslist.repositories;

import com.estudosjava.dslist.entities.Game;
import com.estudosjava.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
