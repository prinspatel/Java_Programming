package mathods;

public class Params_Main 
{
	public static void main(String[] args) 
	{
		// Take data from another class which is Params.java
		Params p=new Params();
		p.greetind1(); // this will print data.
		
		// No para return value
		System.out.println(p.greetings2());
		
		// send data to para adn print
		p.greeting3("Prins");
		
		// take perams and return
		String s=p.greeting4("Janvi");
		System.out.println(s);
		

	}

}
