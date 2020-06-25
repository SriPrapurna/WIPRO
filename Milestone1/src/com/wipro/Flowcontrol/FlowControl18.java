package com.wipro.Flowcontrol;

public class FlowControl18 {
	public static void main(String[] args) {
		int i=0,c=0;
		for(i=1;i<=1000;i++)
		{
			if(c==5)
				break;
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println(i);
				c++;
			}
		}
	}

}
