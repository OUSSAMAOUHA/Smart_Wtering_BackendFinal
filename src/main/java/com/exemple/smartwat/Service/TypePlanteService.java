package com.exemple.smartwat.Service;

import com.exemple.smartwat.beans.TypePlante;
import com.exemple.smartwat.repository.TypePlanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class TypePlanteService {
    @Autowired
    TypePlanteRepository typePlanterepository;

    public List<TypePlante> getAll(){
        return typePlanterepository.findAll();
    }
    public void Save(TypePlante type){
        typePlanterepository.save(type);
    }
    public void Delete(Integer id){
        typePlanterepository.deleteById(id);
    }
    public TypePlante update(TypePlante type){
        return  typePlanterepository.save(type);
    }

}
