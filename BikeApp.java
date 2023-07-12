package com.ex;
import java.util.Scanner;
public class BikeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scan.nextLine();
		System.out.println("Enter cost");
		int cost=scan.nextInt();
		System.out.println("Enter color");
		String color=scan.next();
		System.out.println("Enter brand");
		String brand=scan.next();
		System.out.println("Enter number of mirrors");
		int mirrors=scan.nextInt();
		System.out.println("Enter the number of gears");
		int gear=scan.nextInt();
		System.out.println("Enter the speed of bike");
		int speed=scan.nextInt();
		System.out.println("Enter the height of the bike");
		int height=scan.nextInt();
		Bike b=new Bike(name, cost, color, brand, mirrors, gear, speed, height);
		System.out.println(b.name+" "+b.cost+" "+b.color+" "+b.brand+" "+b.mirrors+" "+b.gear+" "+b.speed+" "+b.height);
		
	}

}
