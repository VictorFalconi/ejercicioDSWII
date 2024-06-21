package com.example.examen.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Curso")
public class Curso {

	private int idCurso;
	private String nombre;

	
}
