package com.exemple.smartwat.Service;

import com.exemple.smartwat.beans.Ferme;
import com.exemple.smartwat.repository.FermeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EspaceVertService {
    @Autowired
    FermeRepository espaceVertrepository;

    public List<Ferme> getAll(){
        return espaceVertrepository.findAll();
    }
    public void Save(Ferme espace){
        espaceVertrepository.save(espace);
    }
    public void Delete(Integer id){
        espaceVertrepository.deleteById(id);
    }
    public Ferme update(Ferme espace){
        return  espaceVertrepository.save(espace);
    }

}
