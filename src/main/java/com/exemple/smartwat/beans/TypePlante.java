package com.exemple.smartwat.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.List;


@Entity  @Data @NoArgsConstructor @AllArgsConstructor
public class TypePlante {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private float humiditeMax;
	private float humiditeMin;
	private float temperature;
	private float luminosite;

	@OneToMany
	@JoinColumn(name="type_plante_id", nullable = true)
	private List<Plante> plantes;
	
}
