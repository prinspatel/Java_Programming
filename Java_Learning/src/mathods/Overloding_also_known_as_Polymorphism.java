package mathods;
import java.util.Scanner;
public class Overloding_also_known_as_Polymorphism 
{
	/*4 rules are applicable in overloading
		-----------
		1) Method names should be same
		2) number of parameters should be different
		3) Data type of parameters should be different
		4) Order of parameters should be different 
	 */
	int a=10;
	int b=20;
	
	void O() 
	{
		System.out.println(a+b);
	}
	
	void O(int a, double b) {
		System.out.println(a+b);
	}
	

	public static void main(String[] args) 
	{
		Overloding_also_known_as_Polymorphism over=new Overloding_also_known_as_Polymorphism();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of a ");
		over.a=sc.nextInt();
		over.b=sc.nextInt();
		over.O();

	}

}
