package com.wipro.Flowcontrol;

public class FlowControl17 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int temp=0;
		temp=n;
		int rem=0,rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
			System.out.println(temp + " is a palindrome ");
		else
			System.out.println(temp + " is not a palindrome ");

	}

}
