package com.exemple.smartwat.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
import java.util.Set;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Parcelle {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;

    @Column(nullable = true)
    private float superficie;

    @Lob
    @Column(name = "photo", nullable = true)
    private String image;


    @OneToMany
    @JoinColumn(name="parcelle_id", nullable = true)
    List<Plantage> plantages;

    @ManyToOne
    @JsonIgnore
    Ferme ferme;







}
