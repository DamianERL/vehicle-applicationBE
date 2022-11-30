package com.task.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.task.models.entities.VehicleEntity;

public interface VehicleRepo extends CrudRepository<VehicleEntity,Long>{
    
}