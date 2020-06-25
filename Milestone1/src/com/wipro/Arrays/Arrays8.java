package com.wipro.Arrays;

public class Arrays8 {
	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i+1]);
		}
		int p=0,q=0,i;
		for( i=0;i<n;i++)
		{
			if(a[i]==6) {
				p=i;
			break;}
		}
		for( i=0;i<n;i++) {
			if(a[i]==7) {
				q=i;
				break;}
		}
		int sum=0;
		if(p<q)
		{
			for(i=0;i<p;i++)
				sum+=a[i];
			for(i=q+1;i<n;i++)
				sum+=a[i];
		}
		else
		{
			for(i=0;i<n;i++)
				sum+=a[i];
		}
	System.out.println(sum);

	}

}
