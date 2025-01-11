package com.rafael.curso.factory.apple.factory;

import com.rafael.curso.factory.apple.model.IPhone;
import com.rafael.curso.factory.apple.model.IPhoneXSMax;


public class IPhoneXSMaxFactory extends IPhoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhoneXSMax();
    }
}
