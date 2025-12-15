package com.example.car_manager_system.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<Car> searchCar(@PathVariable Long id){
        return carService.searchCarById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/add")
    public Car createCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id){
        carService.deleteCarById(id);
        return ResponseEntity.noContent().build();
    }
    
    
    
    
}
