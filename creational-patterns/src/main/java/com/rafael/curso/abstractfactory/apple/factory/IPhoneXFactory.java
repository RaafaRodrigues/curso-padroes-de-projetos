package com.rafael.curso.abstractfactory.apple.factory;

import com.rafael.curso.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import com.rafael.curso.abstractfactory.apple.model.enums.IPhoneType;
import com.rafael.curso.abstractfactory.apple.model.iphone.IPhone;
import com.rafael.curso.abstractfactory.apple.model.iphone.IPhoneX;
import com.rafael.curso.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {
    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIphone(IPhoneType type) {
        switch (type) {
            case IPHONE_X -> {
                return new IPhoneX(rules);
            }
            case IPHONE_XS_MAX -> {
                return new IPhoneXSMax(rules);
            }
            default -> throw new IllegalArgumentException("Invalid type");
        }
    }
}
