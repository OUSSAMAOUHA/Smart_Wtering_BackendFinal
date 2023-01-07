package com.exemple.smartwat.Controller;

import com.exemple.smartwat.Service.PlanteService;
import com.exemple.smartwat.beans.Plante;
import com.exemple.smartwat.beans.TypePlante;
import com.exemple.smartwat.repository.PlantageRepository;
import com.exemple.smartwat.repository.PlanteRepository;
import com.exemple.smartwat.repository.TypePlanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("plante")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PlanteController {
    @Autowired
    PlanteService planteService;

    @Autowired
    PlanteRepository planteRepository;

    @Autowired
    TypePlanteRepository typePlanteRepository;

    @GetMapping("/getallplante")
    public List<Plante> getall(){
        List countrys =planteService.getAll();
        return planteService.getAll();
    }

    @PostMapping("/save/{id}")
    public Plante saveCountry(@RequestBody Plante plante, @PathVariable String id){
        TypePlante typePlante = typePlanteRepository.findById(Integer.parseInt(id)).get();
        plante.setTypePlante(typePlante);
        return planteRepository.save(plante);
    }
    @PostMapping("/update/{id}")
    public Plante updatePlant(@PathVariable String id, @RequestBody Plante plant1) {
        Plante plant = planteRepository.findById(Integer.parseInt(id)).get();
        plant.setLibelle(plant1.getLibelle());
        plant.setRacine(plant1.getRacine());
        return planteRepository.save(plant);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {
        planteService.Delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
