package com.exemple.smartwat.Controller;

import com.exemple.smartwat.Service.ZoneService;
import com.exemple.smartwat.beans.Ferme;
import com.exemple.smartwat.beans.Parcelle;
import com.exemple.smartwat.beans.Plantage;
import com.exemple.smartwat.repository.FermeRepository;
import com.exemple.smartwat.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
@RestController
@RequestMapping("zone")
public class ParcelleController {
    @Autowired
    ZoneService zoneService;

    @Autowired
    ZoneRepository zoneRepository;

    @Autowired
    FermeRepository fermeRepository;


    @GetMapping("/getallzone")
    public List<Parcelle> getall(){
        List countrys =zoneService.getAll();
        return zoneService.getAll();
    }

    @GetMapping("/get/{id}")
    public Parcelle getall(@PathVariable String id){
        return zoneRepository.findById(Integer.parseInt(id)).get();
    }

    @PostMapping("/save/{id}")
    public Parcelle saveParcelle(@RequestBody Parcelle parcelle, @PathVariable String id){
        parcelle.setFerme(fermeRepository.findById(Integer.parseInt(id)).get());
        return  zoneRepository.save(parcelle);
    }

    @PostMapping("/update/{id}")
    public Parcelle updateEmployee(@RequestBody Parcelle newParcelle, @PathVariable String id) {
        Parcelle parcelle = zoneRepository.findById(Integer.parseInt(id)).get() ;
        parcelle.setLibelle(newParcelle.getLibelle());
        parcelle.setSuperficie(newParcelle.getSuperficie());
        return zoneRepository.save(parcelle);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {
        zoneService.Delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
