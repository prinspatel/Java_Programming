package inheritenceTypes;

class first{
	int a=100;
	void display() {
		System.out.println(a);
	}
}

class second extends first   // using extends key word we can use a  class as a parent class
{
	int b=200;
	
	void show() {
		System.out.println(b);
	}
}



public class single_Inheritence {

	public static void main(String[] args) {
		second obj=new second();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.display();
		obj.show();
				

	}

}
