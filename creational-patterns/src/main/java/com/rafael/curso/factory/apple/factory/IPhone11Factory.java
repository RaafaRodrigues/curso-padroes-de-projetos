package com.rafael.curso.factory.apple.factory;

import com.rafael.curso.factory.apple.model.IPhone;
import com.rafael.curso.factory.apple.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhone11();
    }
}
