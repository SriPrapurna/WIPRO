package sampleprogram;
class basic{
	void add() {
		int a=2;
		int b=3;
		System.out.println(a+b);
	}
	void sub()
	{
		int a=5;
		int b=3;
		System.out.println(a-b);
	}
}
public class CLASSOBJECT1 {
	public static void main(String[] args) {
		basic b=new basic();
		b.add();
		b.sub();
	}
}
