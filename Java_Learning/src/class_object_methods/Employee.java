package class_object_methods;

public class Employee {
	int eid;
	String ename;
	int esalary;
	
	void Display() {
		System.out.println("Employe ID is : "+eid);
		System.out.println("Employe Name is : "+ename);
		System.out.println("Employe Salary is : "+esalary);
	}
	void DisplayPera() {
		System.out.println("According to entered data, Employe ID is "+eid+", Name is "+ename+" and total salary is "+esalary);
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.eid=1;
		e1.ename="Prins";
		e1.esalary=10000;
		
		e1.Display();
	}

}
