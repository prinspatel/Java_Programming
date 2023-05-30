package day2;

class Overloading_perant
{
	void m1(int a)
	{
		System.out.println(a);
	}
}

//Overloading means same method name but different behavior
class Overloading_child extends Overloading_perant
{
	void m1(int a, int b)
	{
		System.out.println(a+b);
	}
}



public class Overloading {

	public static void main(String[] args)
	{
		// Overloading means same method name but different behavior
		Overloading_child oc=new Overloading_child();
		oc.m1(100);
		oc.m1(100, 200);
		
	}
	
}
