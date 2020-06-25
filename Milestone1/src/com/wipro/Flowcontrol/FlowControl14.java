package com.wipro.Flowcontrol;

public class FlowControl14 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int sum=0,rem=0;
		while(a>0) 
		{
			rem=a%10;
			sum+=rem;
			a=a/10;
		}
		System.out.println(sum);
	}

}
