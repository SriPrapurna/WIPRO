package com.wipro.Arrays;

public class Arrays3 {
	public static void main(String[] args) {
		int i,found=0;
		int searchelement=Integer.parseInt(args[0]);
		int n=Integer.parseInt(args[1]);
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i+1]);
		}
		for(i=0;i<=n;i++) {
			if(a[i]==searchelement) {
				found=1;
			break;}}
		
		if(found==1) 
		{
			System.out.println(i);
			}
		if(found==0)
			System.out.println("-1");
		
	}

}
