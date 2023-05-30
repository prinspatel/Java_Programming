package practice_Test;
import java.util.Scanner;

public class Palindrom_String {

	public static void main(String[] args) {
		// check reverse string. 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sc.next();
		System.out.println("Entered String is : "+str);
		
		int len=str.length();
		String rev="";
		
		for (int i=len-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		System.out.println("Revers Sting is : "+rev);
		
		//for palindor means compare string. // for example revarce of madam=madam. so it's palindrom string.
		
		if (str.equals(rev)){
			System.out.println("This is Palindrom String");
		}
		else {
			System.out.println("This is Not Palindrom String");
		}
		

	}

}
