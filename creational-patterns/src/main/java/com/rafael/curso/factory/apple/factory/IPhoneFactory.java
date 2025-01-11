package com.rafael.curso.factory.apple.factory;

import com.rafael.curso.factory.apple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIphone() {
        IPhone device;

        device = createIphone();

        device.assemble();
        device.certificates();
        device.getHardware();
        device.pack();

        return device;
    }

    protected abstract IPhone createIphone();
}
