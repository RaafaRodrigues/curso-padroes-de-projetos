package com.rafael.curso.abstractfactory.car.solution.one.service.factory;

import com.rafael.curso.abstractfactory.car.solution.one.service.services.CarRestApiService;
import com.rafael.curso.abstractfactory.car.solution.one.service.services.CarService;
import com.rafael.curso.abstractfactory.car.solution.one.service.services.UserRestApiService;
import com.rafael.curso.abstractfactory.car.solution.one.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {
    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }
}
