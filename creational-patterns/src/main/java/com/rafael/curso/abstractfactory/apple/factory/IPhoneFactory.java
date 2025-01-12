package com.rafael.curso.abstractfactory.apple.factory;

import com.rafael.curso.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import com.rafael.curso.abstractfactory.apple.model.enums.IPhoneType;
import com.rafael.curso.abstractfactory.apple.model.iphone.IPhone;


public abstract class IPhoneFactory {
	CountryRulesAbstractFactory rules;
	
	public IPhoneFactory(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public IPhone orderIphone(IPhoneType type) {
		IPhone device;

		device = createIphone(type);

		device.assemble();
		device.getHardware();
		device.certificates();
		device.pack();

		return device;
	}

	protected abstract IPhone createIphone(IPhoneType type);
}
