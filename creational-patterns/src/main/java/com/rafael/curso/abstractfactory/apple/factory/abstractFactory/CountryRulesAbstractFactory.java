package com.rafael.curso.abstractfactory.apple.factory.abstractFactory;

import com.rafael.curso.abstractfactory.apple.model.certificate.Certificate;
import com.rafael.curso.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
