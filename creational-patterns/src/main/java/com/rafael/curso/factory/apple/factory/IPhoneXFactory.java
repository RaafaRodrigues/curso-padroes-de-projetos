package com.rafael.curso.factory.apple.factory;

import com.rafael.curso.factory.apple.model.IPhone;
import com.rafael.curso.factory.apple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhoneX();
    }
}
