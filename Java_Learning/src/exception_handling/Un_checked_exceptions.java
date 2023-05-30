package exception_handling;
import java.util.Scanner;
public class Un_checked_exceptions {

	public static void main(String[] args) {
		System.out.println("Program Start....");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int value=sc.nextInt();
		// if you enter invalid number Java give error which is java.lang.ArithmeticException
		//  use try and catch method to complete program without error.
		
		try 
		{
			System.out.println("Number devide by 100 and ans is : "+100/value);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You entered wrong input");
		}
		
		
		System.out.println("Program Successful..");
		

	}

}
