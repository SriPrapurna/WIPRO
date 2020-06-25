package com.wipro.classObject;
public class Text {
		int a;
		String Bookname;
		String Author;
		Text(int a,String Bookname,String Author)
		{
			this.a=a;
			this.Bookname=Bookname;
			this.Author=Author;
		}
		void print() {
			System.out.println(a);
			System.out.println(Bookname);
			System.out.println(Author);
		}
		public static void main(String[] args) {
			Text T1=new Text(10,"Half","Chethan");
			T1.print();
		}
	}


