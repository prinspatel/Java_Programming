package day2;



// over right value of same method in different class.
class sbi
{
	double profit()
	{
	return 0.00;
	}
}

class hdfc
{
	double profit()
	{
		return 10.00;
	}
}

class icici
{
	double profit()
	{
		return 20.00;
	}
}

public class Overriding 
{

	public static void main(String[] args)
	{
		sbi sbib=new sbi();
		System.out.println(sbib.profit());
		
		hdfc hdfcb=new hdfc();
		System.out.println(hdfcb.profit());
		
		icici icicib=new icici();
		System.out.println(icicib.profit());
	}

}
