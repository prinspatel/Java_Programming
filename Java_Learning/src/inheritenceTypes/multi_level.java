package inheritenceTypes;

class a{
	int a=100;
	void display() {
		System.out.println(a);
	}
}

class b extends a   // using extends key word we can use a  class as a parent class
{
	int b=200;
	
	void show() {
		System.out.println(b);	
	}
}

class c extends b 
{
	int c=300;
	void print()
	{
		System.out.println(c);
	}
}


public class multi_level {
	
	public static void main(String[] args) {
		
	c obj=new c();
	obj.display();
	obj.show();
	obj.print();
	}
}
