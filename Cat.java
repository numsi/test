package com.test.work;

public class Cat extends Pet{
	
	public Cat(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void run() {
		System.out.println("this is cat run");
	}
	public void say() {
		System.out.println("this is cat say");
	}
	public void catchFat() {
		System.out.println("catch fat");
	}
}
