package com.wipro.Flowcontrol;

public class FlowControl12 {
	public static void main(String[] args) {
		int i,j,count=0;
		for(i=10;i<=99;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0) {
				count++;
			}
			}
		if(count==2)
		{
			System.out.print(i+ " ");
		}
		}
	}
}
