package com.forinvanessa.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forinvanessa.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
