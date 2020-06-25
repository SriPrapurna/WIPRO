package com.wipro.Flowcontrol;

public class FlowControl11 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
	}
	}
}
