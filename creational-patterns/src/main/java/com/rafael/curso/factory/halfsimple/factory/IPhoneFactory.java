package com.rafael.curso.factory.halfsimple.factory;

import com.rafael.curso.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import com.rafael.curso.factory.halfsimple.model.enums.IPhoneType;
import com.rafael.curso.factory.halfsimple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIphone(IPhoneType type) {
        IPhone device;

        device = createIphone(type);

        device.assemble();
        device.certificates();
        device.getHardware();
        device.pack();

        return device;
    }

    protected abstract IPhone createIphone(IPhoneType type);
}
