package com.ex;
import java.util.Scanner;
public class PersonApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id");
		int id =scan.nextInt();
		System.out.println("Enter name");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("Enter gender");
		String gender=scan.next();
		System.out.println("Enter email");
		String emailid=scan.next();
		System.out.println("Enter the phone number");
		long phone =scan.nextLong();
		Person p=new Person(id, name,gender, emailid, phone);
		System.out.println(p.id+" "+p.name+" "+p.gender+" "
				+ " "+p.emailid+" "+p.phone);
		
	}	
		
		
		
	}


