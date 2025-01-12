package com.rafael.curso.factory.simple.factory;

import com.rafael.curso.factory.simple.model.enums.IPhoneType;
import com.rafael.curso.factory.simple.model.*;

public class IPhoneSimpleFactory {

    public IPhone orderIphone(IPhoneType type) {
        IPhone device;

        device = createIphone(type);

        device.assemble();
        device.certificates();
        device.getHardware();
        device.pack();

        return device;
    }

    protected IPhone createIphone(IPhoneType type) {
        switch (type) {
            case IPHONE_11 -> {
                return new IPhone11();
            }
            case IPHONE_11_PRO -> {
                return new IPhone11Pro();
            }
            case IPHONE_X -> {
                return new IPhoneX();
            }
            case IPHONE_XS_MAX -> {
                return new IPhoneXSMax();
            }
            default -> throw new IllegalArgumentException("Invalid type");
        }
    }
}
