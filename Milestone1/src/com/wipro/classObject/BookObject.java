package com.wipro.classObject;

public class BookObject {
	import Book.*;
	class BookObject {
	public static void main(String[] args) {
		Book b1=new Book();
		System.out.println(b1.getISBN());
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getprice());
		Book b2=new Book(123,"pride and prejudice","james austin",99.0);
		b2.getBookdetails();
		b1.getBookdetails();
	}
	}

}
