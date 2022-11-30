package com.task.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.models.entities.VehicleEntity;
import com.task.models.repos.VehicleRepo;

// import jakarta.persistence.Id;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class VehicleService {

    @Autowired
    private VehicleRepo vehiclerepo;

    public VehicleEntity save(VehicleEntity vehicleEntity){
        return vehiclerepo.save(vehicleEntity);
    }

    public VehicleEntity findOne(Long id){
        Optional<VehicleEntity>vehicleEntity = vehiclerepo.findById(id);
        if(!vehicleEntity.isPresent()){
            return null;
        } else {
            return vehicleEntity.get();
        }
    }

    public Iterable<VehicleEntity> findall(){
        return vehiclerepo.findAll(); 
    }

    public void removeOne(Long id){
        vehiclerepo.deleteById(id);
    }



}
