package com.rafael.curso.factory.apple.factory;

import com.rafael.curso.factory.apple.model.IPhone;
import com.rafael.curso.factory.apple.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhone11Pro();
    }
}
