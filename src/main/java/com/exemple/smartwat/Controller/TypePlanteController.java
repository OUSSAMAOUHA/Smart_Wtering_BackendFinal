package com.exemple.smartwat.Controller;

import com.exemple.smartwat.Service.TypePlanteService;
import com.exemple.smartwat.beans.TypePlante;
import com.exemple.smartwat.repository.TypePlanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("type")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TypePlanteController {
    @Autowired
    TypePlanteService typeService;

    @Autowired
    TypePlanteRepository typePlanteRepository;
    @GetMapping("/getalltype")
    public List<TypePlante> getall(){
        List countrys =typeService.getAll();
        return typeService.getAll();
    }

    @PostMapping("/save")
    public TypePlante saveCountry(@RequestBody TypePlante typePlante){
        return typePlanteRepository.save(typePlante);
    }
    @PostMapping("/update/{id}")
    public TypePlante updateEmployee(@RequestBody TypePlante factureWE, @PathVariable String id) {
        TypePlante type1 = typePlanteRepository.findById(Integer.parseInt(id)).get();
        type1.setHumiditeMax(factureWE.getHumiditeMax());
        type1.setHumiditeMin(factureWE.getHumiditeMin());
        type1.setName(factureWE.getName());
        type1.setLuminosite(factureWE.getLuminosite());
        type1.setTemperature(factureWE.getTemperature());
        return typePlanteRepository.save(type1);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {
        typePlanteRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
