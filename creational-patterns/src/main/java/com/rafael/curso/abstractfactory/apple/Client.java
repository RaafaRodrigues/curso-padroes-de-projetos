package com.rafael.curso.abstractfactory.apple;

import com.rafael.curso.abstractfactory.apple.factory.IPhone11Factory;
import com.rafael.curso.abstractfactory.apple.factory.IPhoneFactory;
import com.rafael.curso.abstractfactory.apple.factory.IPhoneXFactory;
import com.rafael.curso.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import com.rafael.curso.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import com.rafael.curso.abstractfactory.apple.model.enums.IPhoneType;
import com.rafael.curso.abstractfactory.apple.model.iphone.IPhone;


public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory countryRulesAbstractFactory = new BrazilianRulesAbstractFactory();
		IPhoneFactory iPhone11Factory = new IPhone11Factory(countryRulesAbstractFactory);
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory(countryRulesAbstractFactory);

		IPhone iPhone = iPhone11Factory.orderIphone(IPhoneType.IPHONE_11);


	}
}
