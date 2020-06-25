package com.wipro.Arrays;

public class Arrays5 {
	public static void main(String[] args) {
		int temp=0;
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i+1]);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("the maximum element of given array is "+ a[a.length-1]);
		System.out.println("the second maximum element of given array is "+ a[a.length-2]);
		System.out.println("the minimum element of given array is "+ a[0]);
		System.out.println("the second minimum element of given array is "+ a[1]);

	}

}
