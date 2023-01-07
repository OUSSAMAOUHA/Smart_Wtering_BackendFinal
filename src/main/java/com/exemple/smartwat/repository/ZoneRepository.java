package com.exemple.smartwat.repository;

import com.exemple.smartwat.beans.Parcelle;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ZoneRepository extends JpaRepositoryImplementation<Parcelle,Integer> {

}
