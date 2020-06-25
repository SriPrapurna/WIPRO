package com.wipro.Arrays;

public class Arrays6 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i+1]);
		}
		int temp=0;
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
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]+ " ");

	}

}
