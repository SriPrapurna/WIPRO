package com.wipro.Flowcontrol;

public class FlowControl5 {
	public static void main(String[] args) {
		int age=Integer.parseInt(args[1]);
		if(args[0].equals("Female"))
		{
			if(age>=1 && age<=58)
			{
				System.out.println("8.28%");
			}
			else if(age<=59 && age<=100)
			{
				System.out.println("9.2%");
			}
		}
		if(args[0].equals("Male"))
		{
			if(age>=0 && age<=58)
			{
				System.out.println("8.4%");
			}
			else
			{
				System.out.println("10.5%");
			}
		}
	}

}
