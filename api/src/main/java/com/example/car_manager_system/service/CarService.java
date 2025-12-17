package com.example.car_manager_system.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.car_manager_system.model.Car;
import com.example.car_manager_system.repository.CarRepository;


import com.example.car_manager_system.exceptions.ResourceNotFoundException;


@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public List<Car> listCarsById(){
        return carRepository.findAll();
    }
    public void deleteCarById(UUID id){
        if(!carRepository.existsById(id)){
            throw new ResourceNotFoundException("The car id:" + id + "cannot be deleted. \n" + "Reason: id not found.");
        }
        carRepository.deleteById(id);
    }
    public Car searchCarById(UUID id){
        return carRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Car " + id + "not found."));
    }
    public Car saveCar(Car car){
        return carRepository.save(car);
    }
}
