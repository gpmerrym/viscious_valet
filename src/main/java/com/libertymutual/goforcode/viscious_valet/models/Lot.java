package com.libertymutual.goforcode.viscious_valet.models;

import java.util.ArrayList;

public class Lot {

	private ArrayList<Car> carList; // type of car list... ArrayList<Car>
	private int capacity;

	public Lot(int capacity) { // constructor
		this.capacity = capacity;
		carList = new ArrayList<Car>(); // set it to an initial value
	}

	public void removeCarFromLot(int index) {
		carList.remove(index-1);
	}

	public int size() {
		return carList.size();

	}

	public void addCar(Car car) { // add car to lot if it has a capacity
		if (isLotFull() == false) {
			carList.add(car);
		}

	}

	public ArrayList<Car> getCarList() {
		return carList;
	}

	public boolean isLotFull() {
		if (carList.size() < capacity) {
			return false;
		} else
			return true;

	}

}
