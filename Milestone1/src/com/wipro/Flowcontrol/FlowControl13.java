package com.wipro.Flowcontrol;

public class FlowControl13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		if(args.length==0)
			System.out.println("Please enter an Integer number");
		if(args.length>0)
		{
			int n=Integer.parseInt(args[0]);
			if(n==0||n==1)
				System.out.println(n + " is neither prime nor composite ");
			else
			{
				for(int i=1;i<=n;i++)
				{
					
					if(n%i==0)
						count++;
				}
				if(count==2)
					System.out.println(n + " is a prime number " );
				else
					System.out.println(n + " is not a prime number " );
				
			}
								}
	}
}




