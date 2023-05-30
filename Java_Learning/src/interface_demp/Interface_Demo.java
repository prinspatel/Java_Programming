package interface_demp;

interface tese1
{
	// only allow interface
	int a=100;  // final and static
	int b=200; // final and static
	
	void test2(); // abstract method ,, unimplemented
	
	default void test3()  //default method
	{
		System.out.println("This is default method");
	}
	
	static void test4()  // static method
	{
		System.out.println("This is static mrthod");
	}
	
}






public class Interface_Demo implements tese1
{
	public void test2()  // override method. 
	{
		System.out.println("Use abstact methid to write code");
	}
		

	public static void main(String[] args) {
		
		Interface_Demo id=new Interface_Demo();
		id.test2();
		id.test3();

	}

}
