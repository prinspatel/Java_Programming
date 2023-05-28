package mathods;

public class EncapsulationDemo_Main 
{
	public static void main(String[] args)
	{
		EncapsulationDemo ec=new EncapsulationDemo();
		
		//using this method we will set value of variable in EncapsulationDemo class.
		ec.setAcc_no(20);
		ec.setName("Prins");
		ec.setAmount(1000.00);
		
		//using this method we will get value of variable from EncapsulationDemo class.
		System.out.println(ec.getAcc_no());
		System.out.println(ec.getName());
		System.out.println(ec.getAmount());
		
		
		
		
		
		
	}

}
