package com.wipro.Arrays;

public class Arrays4 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i+1]);
		}
		for(int i=0;i<n;i++)
			System.out.print(((char)a[i]) +" ");

	}

}
