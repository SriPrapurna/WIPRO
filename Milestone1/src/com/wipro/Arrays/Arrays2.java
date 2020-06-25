package com.wipro.Arrays;

public class Arrays2 {
	public static void main(String[] args) {
		int max=0,min=0;
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i+1]);
		}
		max=a[0];
		min=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("the maximum element of given array is "+ max);
		System.out.println("the minimum element of given array is "+ min);

	}

}
