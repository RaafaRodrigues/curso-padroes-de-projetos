package com.rafael.curso.abstractfactory.car.solution.one.service;

import com.rafael.curso.abstractfactory.car.solution.one.service.services.CarService;
import com.rafael.curso.abstractfactory.car.solution.one.service.factory.EJBAbstractFactory;
import com.rafael.curso.abstractfactory.car.solution.one.service.factory.RestAbstractFactory;
import com.rafael.curso.abstractfactory.car.solution.one.service.factory.ServicesAbstractFactory;
import com.rafael.curso.abstractfactory.car.solution.one.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory servicesAbstractFactory = new EJBAbstractFactory();
		CarService carService = servicesAbstractFactory.getCarService();
		UserService userService = servicesAbstractFactory.getUserService();

		carService.save("SAVE");
		carService.update("UPDATE");
		userService.save("SAVE");
		userService.delete(1);

		System.out.println("-------------------------------------");
		servicesAbstractFactory = new RestAbstractFactory();
		carService = servicesAbstractFactory.getCarService();
		userService = servicesAbstractFactory.getUserService();

		carService.save("SAVE");
		carService.update("UPDATE");
		userService.save("SAVE");
		userService.delete(1);

	}
}
