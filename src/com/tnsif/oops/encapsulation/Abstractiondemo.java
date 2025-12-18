package com.tnsif.oops.encapsulation;

abstract class vehicle{
	abstract void start();}
// implementing abstract class
class Bike extends vehicle{
	void start () {
		System.out.print("bike start with kick or self");		
	}
	
}
class Car extends vehicle {
	void start() {
		System.out.println("car start wiht key or button");	
	}
}
public class Abstractiondemo {
public static void main (String[] args) {
		vehicle v;
		v = new Bike ();
		v.start();
		
		v= new Car();
		v.start();
		
	}
}
	
	