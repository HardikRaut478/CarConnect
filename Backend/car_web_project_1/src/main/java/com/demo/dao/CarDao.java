package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Car;

@Repository
public interface CarDao extends JpaRepository<Car, Integer>{

	List<Car> findAll();
	Car save(Car c);
	Car findById(int id);
	List<Car> findByModel(String model);
}
