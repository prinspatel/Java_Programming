package Day2;

public class Operator {
	public static void main(String[] args) {
		/*
		 Types of operators
		1) Arithmetic operators   + - * / % 
		2) Relational/comparison operators  >  >=  <  <=  !=  == 
		3) Logical operators   &&   ||  !
		4) Increment & Decrement operators  ++  --
		5) Assignment   =   +=   -=   *= /=  %=
		6) conditional/ternary operator  ?: 
		 */
		
		int a=10, b=20;
		// 1) Arithmetic operators   + - * / %
		System.out.println(a+b);
		
		//2) Relational/comparison operators  >  >=  <  <=  !=  ==
		System.out.println("2) Relational/comparison operators next 2 lines");
		System.out.println(a>b); // Answer is NO means False.
		System.out.println(a<b); // Answer in YES means True.
		
		/*3) Logical operators   &&   ||  !
		a		b		a && b	a||b	!a(Not a Value)	!b(Not B Value)
		TRUE	TRUE	TRUE	TRUE		FALSE			FALSE
		TRUE	FALSE	FALSE	TRUE		FALSE			TRUE
		FALSE	TRUE	FALSE	TRUE		TRUE			FALSE
		FALSE	FALSE	FALSE	FALSE		TRUE			TRUE
		*/
		boolean x=true;
		boolean y=false;
		System.out.println("3) Logical operators next 1 line");
		System.out.println(x && y); // According to table answer is False
		
		// 4) Increment & Decrement operators  ++  --
		System.out.println("4) Increment & Decrement operators  ++  --");
		System.out.println(++a); // USeing ++ we add value +1 in a variable means 11 and then print
		System.out.println(--a); // USeing -- we add value -1 in a variable means 10 and then print
		
		//5) Assignment   =   +=   -=   *= /=  %=
		System.out.println("5) Assignment   =   +=   -=   *= /=  %=");
		a=20; // Now the use of assignment operator we assign a value is 20 rather then 10.
		System.out.println(a);
		a+=a;
		System.out.println(a);
		//6) conditional/ternary operator  ?: 
		System.out.println("6) conditional/ternary operator  ?: ");
		System.out.println(a<b ? "A Less then B":"A Greater then B");
		
	}

}
