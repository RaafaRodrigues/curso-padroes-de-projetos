package com.rafael.curso.prototype.deepShallow.model;

public class User implements Cloneable {
	public String name;
	public Integer age;
	public Address address;
	
	public User(String name, Integer age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	@Override
	public User clone() throws CloneNotSupportedException {
		User copy = (User) super.clone();
		Address copyAddress = (Address) copy.address.clone();
		copy.address = copyAddress;
		return copy;
	}
}
