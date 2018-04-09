package com.test.work;

public class test {
	public static void main(String[] args) {
		Dog d1=new Dog("d1",12);
		Dog d2=new Dog("d2",11);
		Cat c1=new Cat("c1",1);
		Cat c2=new Cat("c2",2);
		Pet[] ps= {d1,d2,c1,c2};
		for (Pet pet : ps) {
			System.out.println(pet.getName()+"---"+pet.getAge());
		}
		 
	}

}
