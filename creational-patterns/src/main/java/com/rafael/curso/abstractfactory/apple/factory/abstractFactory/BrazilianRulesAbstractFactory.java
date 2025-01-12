package com.rafael.curso.abstractfactory.apple.factory.abstractFactory;

import com.rafael.curso.abstractfactory.apple.model.certificate.BrazilianCertificate;
import com.rafael.curso.abstractfactory.apple.model.certificate.Certificate;
import com.rafael.curso.abstractfactory.apple.model.packing.BrazilianPacking;
import com.rafael.curso.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
