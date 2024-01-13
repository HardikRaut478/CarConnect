package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String model;
	private String generation;
	private String engine;
	private int start_of_production;
	private String powertrain_architecture;
	private String body_type;
	private int seats;
	private int doors;
	private String fuel_type;
	@Column(columnDefinition = "double(10,1)")
	private double acceleration0100kmh;
	@Column(columnDefinition = "double(10,1)")   
	private double acceleration060mph;
	@Column(columnDefinition = "double(10,1)")   
	private double acceleration0200kmh;
	private String power; 
	private String engine_layout;
	private int number_of_cylinders;
	private String engine_configuration;
	private int kerb_weight;
	private int length;
	private int width;
	private int height;
	private int wheelbase;
	private String drive_wheel;
	private String number_of_gears_and_type_of_gearbox;
	private int maximum_speed;
	private int fuel_tank_capacity;

	public String getDrive_wheel() {
		return drive_wheel;
	}

	public void setDrive_wheel(String drive_wheel) {
		this.drive_wheel = drive_wheel;
	}

	public String getNumber_of_gears_and_type_of_gearbox() {
		return number_of_gears_and_type_of_gearbox;
	}

	public void setNumber_of_gears_and_type_of_gearbox(String number_of_gears_and_type_of_gearbox) {
		this.number_of_gears_and_type_of_gearbox = number_of_gears_and_type_of_gearbox;
	}

	public int getMaximum_speed() {
		return maximum_speed;
	}

	public void setMaximum_speed(int maximum_speed) {
		this.maximum_speed = maximum_speed;
	}

	public int getFuel_tank_capacity() {
		return fuel_tank_capacity;
	}

	public void setFuel_tank_capacity(int fuel_tank_capacity) {
		this.fuel_tank_capacity = fuel_tank_capacity;
	}

	public int getKerb_weight() {
		return kerb_weight;
	}

	public void setKerb_weight(int kerb_weight) {
		this.kerb_weight = kerb_weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWheelbase() {
		return wheelbase;
	}

	public void setWheelbase(int wheelbase) {
		this.wheelbase = wheelbase;
	}

	public String getEngine_layout() {
		return engine_layout;
	}

	public void setEngine_layout(String engine_layout) {
		this.engine_layout = engine_layout;
	}

	public int getNumber_of_cylinders() {
		return number_of_cylinders;
	}

	public void setNumber_of_cylinders(int number_of_cylinders) {
		this.number_of_cylinders = number_of_cylinders;
	}

	public String getEngine_configuration() {
		return engine_configuration;
	}

	public void setEngine_configuration(String engine_configuration) {
		this.engine_configuration = engine_configuration;
	}

	public double getAcceleration060mph() {
		return acceleration060mph;
	}

	public void setAcceleration060mph(double acceleration060mph) {
		this.acceleration060mph = acceleration060mph;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public double getAcceleration0200kmh() {
		return acceleration0200kmh;
	}

	public void setAcceleration0200kmh(double acceleration0200kmh) {
		this.acceleration0200kmh = acceleration0200kmh;
	}

	public double getAcceleration0100kmh() {
		return acceleration0100kmh;
	}

	public void setAcceleration0100kmh(double acceleration0100kmh) {
		this.acceleration0100kmh = acceleration0100kmh;
	}

	public String getBody_type() {
		return body_type;
	}

	public void setBody_type(String body_type) {
		this.body_type = body_type;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public int getStart_of_production() {
		return start_of_production;
	}

	public String getPowertrain_architecture() {
		return powertrain_architecture;
	}

	public void setPowertrain_architecture(String powertrain_architecture) {
		this.powertrain_architecture = powertrain_architecture;
	}

	public void setStart_of_production(int start_of_production) {
		this.start_of_production = start_of_production;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", generation=" + generation + ", engine=" + engine
				+ ", start_of_production=" + start_of_production + ", powertrain_architecture="
				+ powertrain_architecture + ", body_type=" + body_type + ", seats=" + seats + ", doors=" + doors
				+ ", fuel_type=" + fuel_type + ", acceleration0100kmh=" + acceleration0100kmh + ", acceleration060mph="
				+ acceleration060mph + ", acceleration0200kmh=" + acceleration0200kmh + ", power=" + power
				+ ", engine_layout=" + engine_layout + ", number_of_cylinders=" + number_of_cylinders
				+ ", engine_configuration=" + engine_configuration + ", kerb_weight=" + kerb_weight + ", length="
				+ length + ", width=" + width + ", height=" + height + ", wheelbase=" + wheelbase + ", drive_wheel="
				+ drive_wheel + ", number_of_gears_and_type_of_gearbox=" + number_of_gears_and_type_of_gearbox
				+ ", maximum_speed=" + maximum_speed + ", fuel_tank_capacity=" + fuel_tank_capacity + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}
}
