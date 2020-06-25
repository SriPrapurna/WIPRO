package com.wipro.ObjectClass;

public class Sum {
	int a,b;//instance variables scope is through ut the program outside the main
	
	int add(int a1, int b1)
	{
		//scope of argument values is within the block
		a=a1;
		b=b1;
		return(a+b);
	}
	public static void main(String[] args) {
		Sum s = new Sum();
		Sum s1 = new Sum();
		s.a=10;
		s.b=11;
		System.out.println(s1.add(5, 6));
		System.out.println(s.add(10, 20));
	}

}
