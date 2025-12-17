package com.example.car_manager_system.repository;

import com.example.car_manager_system.model.User;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID>{
    
}
