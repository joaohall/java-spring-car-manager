package com.example.car_manager_system.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* no lombok! */
@Entity
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private UUID id;

    private String name;

    private String model;

    private Double price;

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Car(){}
    public Car(String name, String model, Double price){
        this.name = name;
        this.model = model;
        this.price = price;
    }



}
