package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.CarDao;
import com.demo.model.Car;

@Service
@Transactional
public class CarServiceImpl implements CarService{

	@Autowired
	private CarDao cd;

	@Override
	public List<Car> findAll() {
		
		return cd.findAll();
	}

	@Override
	public Car save(Car c) {
		
		return cd.save(c);
	}

	@Override
	public Car findById(int id) {
		
		return cd.findById(id);
	}

	@Override
	public List<Car> findByModel(String model) {
	
		return cd.findByModel(model);
	}
}
