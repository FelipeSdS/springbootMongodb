package br.com.model;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document("coll_usuario")
@Data
@Getter
@Setter
public class Usuario {

	@Id
	private String id;
	
	private String login;
	
	private String senha;
	
	private Date dataCriacao;
}
