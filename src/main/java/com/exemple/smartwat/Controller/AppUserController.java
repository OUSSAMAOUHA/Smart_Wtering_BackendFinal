package com.exemple.smartwat.Controller;

import com.exemple.smartwat.Service.AppUserService;
import com.exemple.smartwat.Service.EspaceVertService;
import com.exemple.smartwat.beans.AppUser;
import com.exemple.smartwat.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AppUserController {
    @Autowired
    AppUserService userService;

    @Autowired
    AppUserRepository appUserRepository;

    @GetMapping("/getalluser")
    public List<AppUser> getall(){
        return appUserRepository.findAll();
    }

    @PostMapping("/login")
    public AppUser postLogin(@RequestBody AppUser user){
        AppUser user1 = appUserRepository.findAppUserByUsername(user.getUsername());
        if(user1 != null && user1.getPassword().equals(user.getPassword())){
            return user1;
        }else{
            return user;
        }
    }

    @PostMapping("/save")
    public AppUser saveUser(@RequestBody AppUser user){
        return appUserRepository.save(user);
    }

    @PostMapping("/update/{id}")
    public AppUser updateEmployee(@RequestBody AppUser user1, @PathVariable String id) {
        AppUser user = appUserRepository.findById(Integer.parseInt(id)).get();

            user.setUsername(user1.getUsername());


            user.setEmail(user1.getEmail());


            user.setPhone(user1.getPhone());


            user.setAddress(user1.getAddress());

        return appUserRepository.save(user);
    }

    @PostMapping("/update/{id}/{pass}")
    public AppUser changePass(@RequestBody AppUser user, @PathVariable String id, @PathVariable String pass){
        AppUser user1 = appUserRepository.findById(Integer.parseInt(id)).get();
        if(user1.getPassword().equals(pass)){
            user1.setPassword(user.getPassword());
            return appUserRepository.save(user1);
        }else{
            return appUserRepository.save(user1);
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {
        userService.Delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public AppUser getUser(@PathVariable String id){
        return appUserRepository.findById(Integer.parseInt(id)).get();
    }

    @PostMapping("/image/{id}")
    public AppUser imageUser(@RequestBody AppUser user1 ,@PathVariable String id){
        AppUser user = appUserRepository.findById(Integer.parseInt(id)).get();
        user.setImage(user1.getImage());
        return  appUserRepository.save(user);
    }


    @Autowired
    private EspaceVertService espaceSer;

    @PostMapping("/api/login")
    public AppUser loginUser(@RequestBody AppUser user){
        AppUser user1 = appUserRepository.findAppUserByUsername(user.getUsername());
        if(user1 != null && user1.getPassword().equals(user.getPassword())){
            return user1;
        }else{
            return null;
        }

    }







}
