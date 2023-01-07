package com.exemple.smartwat.repository;
import com.exemple.smartwat.beans.Plante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.util.List;

public interface PlanteRepository extends JpaRepositoryImplementation<Plante,Integer> {

}
