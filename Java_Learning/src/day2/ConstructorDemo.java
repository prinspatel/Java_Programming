package day2;

public class ConstructorDemo {

	int x,y;
	String s;
	
	// to create constructor, class name should be same.
	// constructor never return any value.
	ConstructorDemo()  // default constructor
	{
		x=100;
		y=200;
		s="name";
	}
	
	void display() 
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	public static void main(String[] args) 
	{
		ConstructorDemo c=new ConstructorDemo();
		c.display();
		

	}

}
