package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Car;
import com.demo.service.CarService;

@RestController
@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500", "*"}, methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE},
allowedHeaders = "*")
public class CarController {

	@Autowired
	private CarService cs;
	
	//display All;
	@GetMapping(value = "/")
	public List<Car> m1()
	{
		return cs.findAll();
	}
	
	//save
	@PostMapping(value = "/save", consumes = "application/json")
	public Car m2(@RequestBody Car c) 
	{
		return cs.save(c);
	}
	
	//find by id
	@GetMapping(value = "/{id}")
	public Car m3(@PathVariable int id)
	{
		return cs.findById(id);
	}
	
	//update
	@PutMapping(value = "/update")
	public Car m4(@RequestBody Car c) 
	{
		return cs.save(c);
	}
	
	//find by model
	@PostMapping(value ="/model")
	public List<Car> m5(@RequestBody Car c)
	{
		return cs.findByModel(c.getModel());
	}
	
}
