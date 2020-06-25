package sampleprogram;

class TEXT {
	int a;
	String Bookname;
	String Author;
	TEXT(int a,String Bookname,String Author)
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
	void prints() {
		System.out.println(a+a);
		System.out.println(Bookname+Bookname);
		System.out.println(Author+Author);
	}
	public static void main(String[] args) {
		TEXT T1=new TEXT(10,"Half","Chethan");
		T1.print();
		T1.prints();
	}
}