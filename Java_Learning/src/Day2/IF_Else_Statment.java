package Day2;

public class IF_Else_Statment {
	public static void main(String[] args) {
		//if condition:
		int a=10;
		int b=20;
		
		System.out.println("IF Condition");
		if (a<b) {
			System.out.println("It's True");
		}
		//if else condition:
		System.out.println("if else condition:");
		if (a>b) {
			System.out.println("a greater then b");
		}
		else {
			System.out.println("Statment is not correct");
		}
		// Exmaple 2
		System.out.println("Example 2 odd and even");
		int x = 10;
		
		if (x%2 == 0) {
			System.out.println("Value of X is Even");
		}
		else {
			System.out.println("Value is Odd");
		}

	}
}
