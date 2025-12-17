package com.example.car_manager_system.model;

import java.time.LocalTime;
import java.util.UUID;

import com.example.car_manager_system.model.enums.StoreCategory;
import com.example.car_manager_system.model.enums.StoreType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @Column(nullable = true)
    private String name;
    
    @Column(length = 500)
    private String description;

    @Enumerated(EnumType.STRING)
    private StoreType type;

    @Enumerated(EnumType.STRING)
    private StoreCategory category;

    @Column(nullable = true)
    private LocalTime openTime;
    
    @Column(nullable = true)
    private LocalTime closeTime;
}
