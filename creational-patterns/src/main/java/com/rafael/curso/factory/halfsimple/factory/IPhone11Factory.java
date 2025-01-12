package com.rafael.curso.factory.halfsimple.factory;

import com.rafael.curso.factory.halfsimple.model.enums.IPhoneType;
import com.rafael.curso.factory.halfsimple.model.IPhone;
import com.rafael.curso.factory.halfsimple.model.IPhone11;
import com.rafael.curso.factory.halfsimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    protected IPhone createIphone(IPhoneType type) {
        switch (type) {
            case IPHONE_11 -> {
                return new IPhone11();
            }
            case IPHONE_11_PRO -> {
                return new IPhone11Pro();
            }
            default -> throw new IllegalArgumentException("Invalid type");
        }
    }
}
