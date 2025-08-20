package com.forinvanessa.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forinvanessa.dslist.dto.GameDTO;
import com.forinvanessa.dslist.dto.GameMinDTO;
import com.forinvanessa.dslist.services.GameService;

@RestController //Recebe os pedidos HTTP e devolve
@RequestMapping(value = "/games") //Define o endereço principal para acessar esse controlador
public class GameController {
	
	@Autowired //Chama um serviço
	private GameService gameService;
	
	@GetMapping(value = "/{id}") //Resposta a requisição GET 
	public GameDTO findById(@PathVariable Long id){
		GameDTO result = gameService.findById(id);
		return result;
	}
	
	@GetMapping 
	public List<GameMinDTO> findAll(){ //Retorna a lista "resumida" sobre os jogos
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}
