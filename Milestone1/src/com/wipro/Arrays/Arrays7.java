package com.wipro.Arrays;

public class Arrays7 {
	public static void main(String[] args) {
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
				if(a[i]==a[j])
				{
					for(int k=j;k<n-1;k++)
						a[k]=a[k+1];
					n--;
				
				j--;
			}
				
	}

}
		
	
for(int i=0;i<n;i++)
	System.out.print(a[i] + " ");

	}

}
