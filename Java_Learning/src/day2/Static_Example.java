	package day2;

public class Static_Example {
	
	static int a=10;  	//static
	int b=20;			//non static
	
	//static
	static void a1() { 	
		System.out.println("This is static variable ");
	}
	
	//non static
	void b1() {
		System.out.println("This is non static variable");
	}
	
	
	public static void main(String[] args) {
		
		System.out.print(a);  // static value access without variable
		// System.out.print(b);  // non static variable can not access without variable
		
		a1(); // static value access without variable
		//b1(); // non static variable can not access without variable
		
		//to access not static value create variable
		Static_Example ns=new Static_Example();
		System.out.println(ns.b);
		ns.b1();
		
		
	}
	

}
