package com.task.models.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="vehicles")
public class VehicleEntity implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;

    private String registration_number;

    private String owner ;
    
    @Column(length = 500)
    private String owner_address;

    private String vehicle_brand ;
    
    private int production_year ;
    
    private int cylinder_capacity ;
    
    private String vehicle_color ;
    
    private String fuel ;

    public VehicleEntity() {
    }

    public VehicleEntity(Long id, String registration_number, String owner, String owner_address, String vehicle_brand,
            int production_year, int cylinder_capacity, String vehicle_color, String fuel) {
        this.id = id;
        this.registration_number = registration_number;
        this.owner = owner;
        this.owner_address = owner_address;
        this.vehicle_brand = vehicle_brand;
        this.production_year = production_year;
        this.cylinder_capacity = cylinder_capacity;
        this.vehicle_color = vehicle_color;
        this.fuel = fuel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner_address() {
        return owner_address;
    }

    public void setOwner_address(String owner_address) {
        this.owner_address = owner_address;
    }

    public String getVehicle_brand() {
        return vehicle_brand;
    }

    public void setVehicle_brand(String vehicle_brand) {
        this.vehicle_brand = vehicle_brand;
    }

    public int getProduction_year() {
        return production_year;
    }

    public void setProduction_year(int production_year) {
        this.production_year = production_year;
    }

    public int getCylinder_capacity() {
        return cylinder_capacity;
    }

    public void setCylinder_capacity(int cylinder_capacity) {
        this.cylinder_capacity = cylinder_capacity;
    }

    public String getVehicle_color() {
        return vehicle_color;
    }

    public void setVehicle_color(String vehicle_color) {
        this.vehicle_color = vehicle_color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    

}
