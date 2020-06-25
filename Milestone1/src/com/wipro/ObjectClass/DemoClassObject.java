package com.wipro.ObjectClass;

public class DemoClassObject {
	//main
	//instance variables---that are accesed bythe object
	int i;
	double d;
	//instance method
	//void m is a method.....
	void m()
	{
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		//aby instance need to be accesed only by using the object
		DemoClassObject dc = new DemoClassObject();
		// . indicates inside
		//note : never write the data of the object in main
		
		dc.i=10;
		dc.d=11.9;
		dc.m();
		System.out.println(dc.i);
	}

}
