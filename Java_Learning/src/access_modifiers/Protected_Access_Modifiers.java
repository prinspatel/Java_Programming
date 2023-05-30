package access_modifiers;

//only through inheritance possible to implement.

import practice_Test.Practice_for_AceessModifiers;
// import package name . class name.

public class Protected_Access_Modifiers extends Practice_for_AceessModifiers{
// extend with class name.
	
	public static void main(String[] args) {
		Protected_Access_Modifiers pr=new Protected_Access_Modifiers();
		// create object with main class.
		
		System.out.println(pr.pt1);
		pr.ptt1();

	}

}
