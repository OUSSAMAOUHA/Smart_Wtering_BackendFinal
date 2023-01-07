package com.exemple.smartwat.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;


@Entity  @Data @NoArgsConstructor @AllArgsConstructor
public class Plante {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String libelle;
	private String image;
	private String racine;

	@ManyToOne
	@JsonIgnore
	TypePlante typePlante;
}
