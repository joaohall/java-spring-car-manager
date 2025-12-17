package com.example.car_manager_system.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {

    // You miss the store FK for the user 
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private UUID id;
    
    @Column(unique = true, nullable = false)
    private String username;
    
    @Column(nullable = false)
    private String password;
    
    @Column(unique = false, nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String surename;

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return this.surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }
    

    public User(){}

    public User(String username, String password, String name, String surename){
        this.username = username;
        this.password = password;
        this.surename = surename;
        this.name = name;
    }
   
}
