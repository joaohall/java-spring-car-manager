package com.example.car_manager_system.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.car_manager_system.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, UUID>{
    
}
