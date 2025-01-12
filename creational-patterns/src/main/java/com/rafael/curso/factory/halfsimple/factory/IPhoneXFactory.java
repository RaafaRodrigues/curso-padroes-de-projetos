package com.rafael.curso.factory.halfsimple.factory;

import com.rafael.curso.factory.halfsimple.model.enums.IPhoneType;
import com.rafael.curso.factory.halfsimple.model.*;

public class IPhoneXFactory extends IPhoneFactory {
    @Override
    protected IPhone createIphone(IPhoneType type) {
        switch (type) {
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
