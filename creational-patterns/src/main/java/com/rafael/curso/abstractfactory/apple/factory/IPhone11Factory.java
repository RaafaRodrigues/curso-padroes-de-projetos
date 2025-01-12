package com.rafael.curso.abstractfactory.apple.factory;

import com.rafael.curso.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import com.rafael.curso.abstractfactory.apple.model.enums.IPhoneType;
import com.rafael.curso.abstractfactory.apple.model.iphone.IPhone;
import com.rafael.curso.abstractfactory.apple.model.iphone.IPhone11;
import com.rafael.curso.abstractfactory.apple.model.iphone.IPhone11Pro;


public class IPhone11Factory extends IPhoneFactory {

    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIphone(IPhoneType type) {
        switch (type) {
            case IPHONE_11 -> {
                return new IPhone11(rules);
            }
            case IPHONE_11_PRO -> {
                return new IPhone11Pro(rules);
            }
            default -> throw new IllegalArgumentException("Invalid type");
        }
    }
}
