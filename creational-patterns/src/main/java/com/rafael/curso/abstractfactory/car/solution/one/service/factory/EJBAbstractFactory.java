package com.rafael.curso.abstractfactory.car.solution.one.service.factory;

import com.rafael.curso.abstractfactory.car.solution.one.service.services.CarService;
import com.rafael.curso.abstractfactory.car.solution.one.service.services.UserEJBService;
import com.rafael.curso.abstractfactory.car.solution.one.service.services.CarEJBService;
import com.rafael.curso.abstractfactory.car.solution.one.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {
    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }
}
