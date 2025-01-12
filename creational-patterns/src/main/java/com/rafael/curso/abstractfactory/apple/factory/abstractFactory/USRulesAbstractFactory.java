package com.rafael.curso.abstractfactory.apple.factory.abstractFactory;

import com.rafael.curso.abstractfactory.apple.model.certificate.Certificate;
import com.rafael.curso.abstractfactory.apple.model.certificate.USCertificate;
import com.rafael.curso.abstractfactory.apple.model.packing.BrazilianPacking;
import com.rafael.curso.abstractfactory.apple.model.packing.Packing;
import com.rafael.curso.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
}
