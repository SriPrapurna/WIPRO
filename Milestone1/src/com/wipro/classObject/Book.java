package com.wipro.classObject;

public class Book {
	private int ISBN;
	private String Title;
	private String Author;
	private double price;
	public Book(int ISBN,String Title,String Author,double price)
	{
		this.ISBN=ISBN;
		this.Title=Title;
		this.Author=Author;
		this.price=price;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
