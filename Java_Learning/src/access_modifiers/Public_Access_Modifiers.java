package access_modifiers;
import practice_Test.Practice_for_AceessModifiers;

public class Public_Access_Modifiers{

	public static void main(String[] args) 
	{
		//from same package
		Test_Case pt=new Test_Case();
		System.out.println(pt.t3);
		pt.tt1();
		
		System.out.println("---------------------------------------------------------");
		
		//from another package. without inheritance(extend method)
		Practice_for_AceessModifiers ap=new Practice_for_AceessModifiers();
		System.out.println(ap.pu1);
		ap.ppu1();
		

	}

}
	