package com.rafael.curso.factory.halfsimple;

import com.rafael.curso.factory.halfsimple.factory.IPhone11Factory;
import com.rafael.curso.factory.halfsimple.factory.IPhoneFactory;
import com.rafael.curso.factory.halfsimple.factory.IPhoneXFactory;
import com.rafael.curso.factory.halfsimple.model.enums.IPhoneType;
import com.rafael.curso.factory.halfsimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iPhone11Factory = new IPhone11Factory();
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = iPhoneXFactory.orderIphone(IPhoneType.IPHONE_X);
		System.out.println(iPhone);
		
		System.out.println("\n\n### Ordering an iPhone 11 Pro");
		iPhone = iPhone11Factory.orderIphone(IPhoneType.IPHONE_11_PRO);
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone 11");


		iPhone = iPhone11Factory.orderIphone(IPhoneType.IPHONE_11);
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone XS MAX");

		iPhone = iPhoneXFactory.orderIphone(IPhoneType.IPHONE_XS_MAX);
		System.out.println(iPhone);

	}
}
