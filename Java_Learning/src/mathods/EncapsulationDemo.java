package mathods;

public class EncapsulationDemo 
{
	/*	wrapping up of data and methods in to single unit(class).
		all variables should be private.
		we can access variables only through methods(setters & getters) 
	 */
	
	private int acc_no;		// with the use of "private" variable can not use directly, to access variable we use public get and set method.
	private String name;
	private double amount;
	
	
	// to enter all of this code we use ---  source -->> Generate Getter and Setter -->> Select Private Variable
	// get use to get value from variable
	public int getAcc_no() {
		return acc_no;
	}

	// set use to set value for variable.
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
	//we will use another class for main method. 

}
