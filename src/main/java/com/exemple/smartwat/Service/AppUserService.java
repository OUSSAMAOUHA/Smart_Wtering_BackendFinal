package com.exemple.smartwat.Service;

import com.exemple.smartwat.beans.AppUser;
import com.exemple.smartwat.repository.AppUserRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AppUserService {
    @Autowired
    AppUserRepository userrepository;

    public List<AppUser> getAll(){
        return userrepository.findAll();
    }
    public void save(AppUser user){
        userrepository.save(user);
    }
    public void Delete(Integer id){
        userrepository.deleteById(id);
    }
    public AppUser update(AppUser user){
        return  userrepository.save(user);
    }

    public AppUser saveUser(AppUser user) {
        return userrepository.save(user);
    }

    public AppUser getUser(String username) {
        return userrepository.findByUsername(username);
    }

    public List<AppUser> getUsers() {
        return userrepository.findAll();
    }

    public AppUser getUser(Integer id) {
        return userrepository.getById(id);
    }

    public void supprimer(Integer id) {
        userrepository.deleteById(id);
    }


}
