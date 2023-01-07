package com.exemple.smartwat.Controller;

import com.exemple.smartwat.Service.EspaceVertService;
import com.exemple.smartwat.beans.AppUser;
import com.exemple.smartwat.beans.Ferme;
import com.exemple.smartwat.repository.AppUserRepository;
import com.exemple.smartwat.repository.FermeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("espace")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FermeConroller {
    @Autowired
    EspaceVertService espaceService;

    @Autowired
    FermeRepository fermeRepository;

    @Autowired
    AppUserRepository appUserRepository;




    @GetMapping("/getallespace")
    public List<Ferme> getall(){
        List countrys =espaceService.getAll();
        return espaceService.getAll();
    }

    @PostMapping("/save/{id}")
    public Ferme saveCountry(@RequestBody Ferme espace, @PathVariable String id){
        AppUser user = appUserRepository.findById(Integer.parseInt(id)).get();
        espace.setUser(user);
        return fermeRepository.save(espace);
    }
    @PostMapping("/update/{id}")
    public Ferme updateEmployee(@RequestBody Ferme espace, @PathVariable String id) {
        Ferme ferme = fermeRepository.findById(Integer.parseInt(id)).get();
        ferme.setLibelle(espace.getLibelle());
        return fermeRepository.save(ferme);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {
        espaceService.Delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/api/farmer/espaces_verts/{id}")
    public List<Ferme> getFermes(@PathVariable String id){
        return fermeRepository.findByUserId(Integer.parseInt(id));
    }

}
