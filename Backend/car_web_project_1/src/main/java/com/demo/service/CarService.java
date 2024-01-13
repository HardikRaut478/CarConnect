package com.demo.service;

import java.util.List;

import com.demo.model.Car;

public interface CarService {

	List<Car> findAll();
	Car save(Car c);
	Car findById(int id);
	List<Car> findByModel(String model);
}
