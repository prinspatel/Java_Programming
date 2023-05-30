package day2;

class test
{	
	int a=100;
	final int b=200; // variable we can not change because we used final key word.
}


public class Final_KeyWord {

	public static void main(String[] args) {
		test t=new test();
		t.a=1001;
		System.out.println(t.a);
		
		//t.b=2001; //getting error cause e can not change value because we used final key w0
		System.out.println(t.b);
		
		

	}

}
