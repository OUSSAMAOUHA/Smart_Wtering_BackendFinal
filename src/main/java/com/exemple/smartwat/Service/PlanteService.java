package com.exemple.smartwat.Service;

import com.exemple.smartwat.beans.Plante;
import com.exemple.smartwat.repository.PlanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PlanteService {
    @Autowired
    PlanteRepository planterepository;

    public List<Plante> getAll(){
        return planterepository.findAll();
    }
    public Plante Save(Plante plante){
        planterepository.save(plante);
        return plante;
    }
    public void Delete(Integer id){
        planterepository.deleteById(id);
    }
    public Plante update(Plante plante){
        return  planterepository.save(plante);
    }

}
