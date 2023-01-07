package com.exemple.smartwat.Service;

import com.exemple.smartwat.beans.Plantage;
import com.exemple.smartwat.repository.PlantageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PlantageService {
    @Autowired
    PlantageRepository plantagerepository;

    public List<Plantage> getAll(){
        return plantagerepository.findAll();
    }
    public void Save(Plantage plantage){
        plantagerepository.save(plantage);
    }
    public void Delete(Integer id){
        plantagerepository.deleteById(id);
    }
    public Plantage update(Plantage plantage){
        return  plantagerepository.save(plantage);
    }

}
