package day2;

import java.util.Scanner;
public class Input_from_User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Week Number");
		int Weekno=sc.nextInt();
		if (Weekno == 1) {
			System.out.println("Sunday");
		}
		else if (Weekno == 2) {
			System.out.println("Monday");
		}
		else if (Weekno == 3) {
			System.out.println("Tuesday");
		}
		else if (Weekno == 4) {
			System.out.println("Wednesday");
		}
		else if (Weekno == 5) {
			System.out.println("Thursday");
		}
		else if (Weekno == 6) {
			System.out.println("Friday");
		}
		else if (Weekno == 7) {
			System.out.println("Saturday");
		}
		
	}
}
