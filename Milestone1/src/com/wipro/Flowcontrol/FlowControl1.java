package com.wipro.Flowcontrol;

public class FlowControl1 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		if(n%2==0)
			System.out.println(n + " is Even");
		else
			System.out.println(n + " is Odd");
	}

}
