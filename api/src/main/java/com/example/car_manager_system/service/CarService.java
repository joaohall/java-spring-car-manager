package com.example.car_manager_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.car_manager_system.model.Car;
import com.example.car_manager_system.repository.CarRepository;


@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public List<Car> listCarsById(){
        return carRepository.findAll();
    }
    public void deleteCarById(Long id){
        carRepository.deleteById(id);
    }
    public Optional<Car> searchCarById(Long id){
        return carRepository.findById(id);
    }
    public Car saveCar(Car car){
        return carRepository.save(car);
    }
}
