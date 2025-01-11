package com.rafael.curso.factory.apple;

import com.rafael.curso.factory.apple.factory.*;
import com.rafael.curso.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");

		IPhoneFactory iPhoneFactory = new IPhoneXFactory();
		IPhone iPhone = iPhoneFactory.orderIphone();
		System.out.println(iPhone);
		
		System.out.println("\n\n### Ordering an iPhone 11 Pro");

		iPhoneFactory = new IPhone11ProFactory();
		iPhone = iPhoneFactory.orderIphone();
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone 11");

		iPhoneFactory = new IPhone11Factory();
		iPhone = iPhoneFactory.orderIphone();
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone XS MAX");

		iPhoneFactory = new IPhoneXSMaxFactory();
		iPhone = iPhoneFactory.orderIphone();
		System.out.println(iPhone);

	}
}
