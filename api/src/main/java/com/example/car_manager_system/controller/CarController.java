package com.example.car_manager_system.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.car_manager_system.exceptions.ResourceNotFoundException;
import com.example.car_manager_system.model.Car;
import com.example.car_manager_system.service.CarService;




@RestController
@RequestMapping("/api/car")
public class CarController {
    private final CarService carService;
    public CarController(CarService carService){
        this.carService = carService;
    }
    @GetMapping("/list")
    public List<Car> listCars() {
        return carService.listCarsById();
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<?> searchCar(@PathVariable UUID id){
            try{
                Car car = carService.searchCarById(id);
                return ResponseEntity.ok(car);
            }
            catch (ResourceNotFoundException e){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
            }
    }
    @PostMapping("/add")
    public Car createCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable UUID id){
        carService.deleteCarById(id);
        return ResponseEntity.noContent().build();
    }    
}
