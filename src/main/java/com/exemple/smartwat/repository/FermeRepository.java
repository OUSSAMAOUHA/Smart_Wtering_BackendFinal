package com.exemple.smartwat.repository;


import com.exemple.smartwat.beans.Ferme;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.util.List;

public interface FermeRepository extends JpaRepositoryImplementation<Ferme, Integer> {
    public List<Ferme> findByUserId(int i);


}
