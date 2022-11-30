package com.task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.models.entities.VehicleEntity;
import com.task.services.VehicleService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/vehicle-data")
public class VehicleApps {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public VehicleEntity create(@RequestBody VehicleEntity vehicleEntity){
        return vehicleService.save(vehicleEntity);
    }
    
    @GetMapping
    public Iterable<VehicleEntity> findAll(){
        return vehicleService.findall();
    }

    @GetMapping("/{id}")
    public VehicleEntity findone(@PathVariable("id") Long id){
        return vehicleService.findOne(id);
    }

    @PatchMapping
    public VehicleEntity update(@RequestBody VehicleEntity vehicleEntity){
        return vehicleService.save(vehicleEntity);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id){
        vehicleService.removeOne(id);
    }
}
