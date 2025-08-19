package com.forinvanessa.dslist.dto;

import com.forinvanessa.dslist.entities.Game;
import com.forinvanessa.dslist.projections.GameMinProjection;

public class GameMinDTO {
	
	private Long id; //Chave Primária - Id no banco de dados
	private String title; //Título
	private Integer year; //Ano
	private String imgUrl; //Imagem
	private String shortDescription; //Descrição resumida
	
	public GameMinDTO() {
		
	}
	

	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}
	
	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
