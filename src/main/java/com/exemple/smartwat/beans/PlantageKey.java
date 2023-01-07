package com.exemple.smartwat.beans;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Embeddable
public class PlantageKey implements Serializable {

    private Date date;
    private int plantes;

    private int parcelle;
    private int nombre;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlantageKey that = (PlantageKey) o;
        return plantes == that.plantes && parcelle == that.parcelle && nombre == that.nombre && date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, plantes, parcelle, nombre);
    }
}
