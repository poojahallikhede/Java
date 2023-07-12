package com.ex;

public class Bike {
		String name;
		int cost;
		String color;
		String brand;
		int mirrors;
		int gear;
		int speed;
		int height;
		public Bike(String name, int  cost, String color, String brand, int mirrors, int gear, int speed, int height ) {
			super();
			this.name=name;
			this.cost=cost;
			this.color=color;
			this.brand=brand;
			this.mirrors=mirrors;
			this.gear=gear;
			this.speed=speed;
			this.height=height;
		}
		void ride()
		{
			System.out.println(name+"Riding");
			
		}
		void balancing()
		{
			System.out.println(name+ "balancing");

	}


}
