package com.libertymutual.goforcode.viscious_valet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.viscious_valet.models.Car;
import com.libertymutual.goforcode.viscious_valet.models.Lot;

@Controller
public class AppController {

	private Lot carLot; // declare

	public AppController() {
		carLot = new Lot(5); // initialize

	}

	@RequestMapping("/remove")
	public ModelAndView removeCar(int carIndex) {
		carLot.removeCarFromLot(carIndex);
		ModelAndView mv;
		mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;

	}

	@RequestMapping("/")
	public ModelAndView showApp(String license, String color, String make, String model, String state) {
		// If License is not null and the length of the license is greater than 0
		// create a new instance of the car class from the values submitted

		if ((license != null) && (license.length() > 0)) {
			Car car;
			car = new Car(make, model, color, state, license);

			// park the car in the lot
			// (QUESTION: how do we do this?)
			// (ANSWER: We need to add a method to the lot class and call that method)
			carLot.addCar(car);
		}
		// carLot.removeCar(Car car);
		// ModelAndView mv = new ModelAndView();
		ModelAndView mv; // declare variable
		mv = new ModelAndView(); // setting object
		mv.setViewName("app");
		mv.addObject("lot", carLot);

		return mv;
	}

}
