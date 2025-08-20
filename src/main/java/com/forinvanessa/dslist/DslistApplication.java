package com.forinvanessa.dslist; //Indica em qual pacote essa classe está guardada


//Aqui são as configurações e o que liga a SpringBoot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Organiza a aplicação
public class DslistApplication {
	
	//Botão de start
	public static void main(String[] args) {
		SpringApplication.run(DslistApplication.class, args);
	}

}
