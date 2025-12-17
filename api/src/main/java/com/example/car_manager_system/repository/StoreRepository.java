package com.example.car_manager_system.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.car_manager_system.model.Store;

public interface StoreRepository extends JpaRepository<Store, UUID>{
    
}
