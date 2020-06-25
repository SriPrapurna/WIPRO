package com.wipro.Arrays;

public class Arrays1 {
	public static void main(String[] args) {
		int sum =0,avg=0;
		int n = Integer.parseInt(args[0]);
		int [] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i+1]);
		}
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		avg=sum/n;
		System.out.println("The sum of given array is "+ sum);
		System.out.println("The average of given array is "+ avg);
	}

}
