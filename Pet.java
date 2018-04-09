package com.test.work;

public class Pet {
	/**
	 * PetÀà
	 */
	private String name;
	private int age;
	
	
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void say() {
		System.out.println("this is pet say");
	}
	public void run() {
		System.out.println("this is pet run");
	}
	


}
