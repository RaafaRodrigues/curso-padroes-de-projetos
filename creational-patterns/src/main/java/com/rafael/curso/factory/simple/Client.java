package com.rafael.curso.factory.simple;


import com.rafael.curso.factory.simple.factory.IPhoneSimpleFactory;
import com.rafael.curso.factory.simple.factory.enums.IPhoneType;
import com.rafael.curso.factory.simple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneSimpleFactory iPhoneSimpleFactory = new IPhoneSimpleFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = iPhoneSimpleFactory.orderIphone(IPhoneType.IPHONE_X);
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone 11 Pro");
		iPhone = iPhoneSimpleFactory.orderIphone(IPhoneType.IPHONE_11_PRO);
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone 11");

		iPhone = iPhoneSimpleFactory.orderIphone(IPhoneType.IPHONE_11);
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone XS MAX");

		iPhone = iPhoneSimpleFactory.orderIphone(IPhoneType.IPHONE_XS_MAX);
		System.out.println(iPhone);

	}
}
