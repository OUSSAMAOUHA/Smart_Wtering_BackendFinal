package com.exemple.smartwat.Controller;

import com.exemple.smartwat.Service.PlantageService;
import com.exemple.smartwat.beans.*;
import com.exemple.smartwat.repository.PlantageRepository;
import com.exemple.smartwat.repository.PlanteRepository;
import com.exemple.smartwat.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("plantage")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class PlantageController {
    @Autowired
    PlantageService plantageService;

    @Autowired
    PlantageRepository plantageRepository;

    @Autowired
    PlanteRepository planteRepository;
    @Autowired
    ZoneRepository zoneRepository;

    @GetMapping("/getallplantage")
    public List<Plantage> getall(){
        return plantageRepository.findAll();
    }



    @PostMapping("/save/{parcelle}/{plante}")
    public Plantage saveCountry(@RequestBody HashMap plantage1, @PathVariable String parcelle, @PathVariable String plante){
        Parcelle parcelle1 = zoneRepository.findById(Integer.parseInt(parcelle)).get();
        Plante plante1 = planteRepository.findById(Integer.parseInt(plante)).get();
        PlanteServicePK planteServicePK = new PlanteServicePK(plantage1.get("date").toString(), Integer.parseInt(parcelle), Integer.parseInt(plante), Integer.parseInt(plantage1.get("quantity").toString()));
        Plantage plantage = new Plantage();
        plantage.setPk(planteServicePK);
        plantage.setPlante(plante1);
        plantage.setParcelle(parcelle1);
        return plantageRepository.save(plantage);
    }

    @PostMapping("/save/a7")
    public Object saveCountry2(@RequestBody HashMap objects){
        return objects.get("aaa");
    }
    @PutMapping("/update")
    public ResponseEntity<Plantage> updateEmployee(@RequestBody Plantage plantage) {
        Plantage updateEmployee = plantageService.update(plantage);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {
        plantageService.Delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
