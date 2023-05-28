package inheritenceTypes;

class parent
{
	void p(int a) {
		System.out.println(a);
	}
}

class child1 extends parent
{
	void c1(int b) 
	{
		System.out.println(b);
	}
}

class child2 extends parent
{
	void c2(int c) 
	{
		System.out.println(c);
	}
}



public class Hierarchy {

	public static void main(String[] args) 
	{
		child1 c1=new child1();
		child2 c2=new child2();
		
		c1.c1(100);
		c2.c2(200);
		

	}

}
