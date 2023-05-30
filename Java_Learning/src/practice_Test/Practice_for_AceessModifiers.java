package practice_Test;

public class Practice_for_AceessModifiers {
	
	protected String pt1="Variable Protected Access Modifiers";	
	protected void ptt1()
	{
		System.out.println("Method of Protected Access Modifiers");
	}
	
	
	public String pu1="Variable of Public Access Modifiers from another Package";	
	public void ppu1()
	{
		System.out.println("Variable of Public Access Modifiers from another Package");
	}

	public static void main(String[] args) {

		System.out.println("This file is use for another package access_modifiers");
		

	}

}
