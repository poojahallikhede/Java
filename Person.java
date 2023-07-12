package com.ex;

public class Person {
	int id;
	String name;
	String gender;
	String emailid;
	long phone;
	public Person(int id, String name, String gender, String emailid, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.emailid = emailid;
		this.phone = phone;
	}
	void eat()
	{
		System.out.println(name+" Is eating....");
	}
	void sleep()
	{
		System.out.println(gender+" "+name+"Is sleeping");
	}
}
