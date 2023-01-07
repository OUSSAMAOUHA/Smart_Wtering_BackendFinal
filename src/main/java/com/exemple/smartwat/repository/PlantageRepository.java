package com.exemple.smartwat.repository;
import com.exemple.smartwat.beans.Plantage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.util.List;

public interface PlantageRepository extends JpaRepositoryImplementation<Plantage,Integer> {

}
