package access_modifiers;

public class Test_Case {
	
	/*variable and method by default use default access modifiers and 
	 * use only with in package.*/
	String t1="Variable Default Access Modifiers";	
	void tt1()
	{
		System.out.println("Method of Default Access Modifiers");
	}
	
	//Public Access Modifiers use anywhere
	public String t3="Variable of Public Access Modifiers from Same Package";	
	public void tt3()
	{
		System.out.println("Method of Method of Public Access Modifiers from Same Package");
	}

	
	
}
