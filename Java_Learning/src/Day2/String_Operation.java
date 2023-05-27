package Day2;

public class String_Operation {
	public static void main(String[] args) {

		// String s="Welcome";
		String s = new String("Welcome");
		System.out.println(s);

		// length of string
		System.out.println(s.length());

		// concat() ,, join string
		String s1 = "Welcome to ";
		String s2 = "java Program";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));

		// trim - remove left and right side space
		s1 = "   Welcome   ";
		System.out.println(s1.trim());

		// charAct() -- return a single char based on index we passed
		// String s="Welcome";
		System.out.println(s.charAt(0));

		// contains() -- returns boolean value true/false
		System.out.println(s.contains("Wel")); // true
		System.out.println(s.contains("wel")); // False because w is capital
		System.out.println(s.contains("Cel")); // False

		// equals() -- compare two strings -- Return boolean value
		s1 = "Welcome";
		s2 = "welcome";
		System.out.println(s1.equals(s2)); /// false
		System.out.println(s1.equalsIgnoreCase(s2)); /// True // ignore lover and upper case

		// replace() -- replace single or multiple char
		s = "Welcome to selenium testing";
		// System.out.println(s.replace('e','X'));
		System.out.println(s.replace("selenium", "Java"));
		
		//split() -- divide string in multiple part using delimeter
		//some char we can not use such as * ^ . $ ? + - 
		String email="abc@gmail.com";
		String a[]=email.split("@");
		System.out.println(a[0]);
		
		//toUpperCase() // toLowerCase()
		s="Welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

	}
}
