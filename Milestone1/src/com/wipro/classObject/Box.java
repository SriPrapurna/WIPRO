package com.wipro.classObject;

public class Box{
	int width,height,depth; //member variables
	Box(int width,int height,int depth)//cconstructor
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	void setvalue(int width,int height,int depth)//method
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	int volume() //method
	{
		return width*height*depth;
	}
	public static void main(String[] args) {
		Box b=new Box(5,4,6);
		System.out.println(b.volume());
	}
}
