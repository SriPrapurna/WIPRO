package com.wipro.Flowcontrol;
public class FlowControl6 {
	public static void main(String[] args) {
		char a=args[0].charAt(0);
				if(a>=65 && a<=90)
				{
					System.out.println(a + "->"+ (a+=32));
				}
				else
				{
					System.out.println(a +"->"+ (a-=32));
				}
	}
}
