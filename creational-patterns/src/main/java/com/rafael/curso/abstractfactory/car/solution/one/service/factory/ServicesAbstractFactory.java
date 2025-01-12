package com.rafael.curso.abstractfactory.car.solution.one.service.factory;

import com.rafael.curso.abstractfactory.car.solution.one.service.services.CarService;
import com.rafael.curso.abstractfactory.car.solution.one.service.services.UserService;

public interface ServicesAbstractFactory {

    UserService getUserService();
    CarService getCarService();

}
