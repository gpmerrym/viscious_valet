package com.libertymutual.goforcode.viscious_valet.models;

public class Car {

	private String make;
	private String model;
	private String color;
	private String state;
	private String license;

	public Car(String make, String model, String color, String state, String license) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.state = state;
		this.license = license;

	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getState() {
		return state;
	}

	public String getLicense() {
		return license;
	}

}
