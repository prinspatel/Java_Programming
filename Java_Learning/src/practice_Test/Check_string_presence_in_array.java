package practice_Test;

import java.util.Arrays;
import java.util.Scanner;
public class Check_string_presence_in_array {

	public static void main(String[] args) {
		String s[]= {"a","b","c","d"};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Whick String you want to check : ");
		String str=sc.next();
		
		int len=s.length;
		for (int i=0;i<len;i++) {
			if (str.equals(s[i])) {
				System.out.println("String is available in Array");
			}
			
		}
	}

}
