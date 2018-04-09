package com.test.work;

public class Dog extends Pet{
	
	public Dog(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void run() {
		System.out.println("this is dot run");
	}
	public void say() {
		System.out.println("this is dog say");
	}
	public void swim() {
		System.out.println("this is dog swim");
	}
	

}
