package com.exemple.smartwat.Service;

import com.exemple.smartwat.beans.Parcelle;
import com.exemple.smartwat.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ZoneService {
    @Autowired
    ZoneRepository zonerepository;

    public List<Parcelle> getAll(){
        return zonerepository.findAll();
    }
    public void Save(Parcelle factureWE){
        zonerepository.save(factureWE);
    }
    public void Delete(Integer id){
        zonerepository.deleteById(id);
    }
    public Parcelle update(Parcelle factureWE){
        return  zonerepository.save(factureWE);
    }

}
