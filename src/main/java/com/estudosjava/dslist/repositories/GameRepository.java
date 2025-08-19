package com.estudosjava.dslist.repositories;

import com.estudosjava.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
