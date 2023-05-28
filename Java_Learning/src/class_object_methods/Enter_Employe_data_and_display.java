package class_object_methods;
import java.util.Scanner;
public class Enter_Employe_data_and_display {

	public static void main(String[] args) {
		// Using employee class we will store and display data
		Scanner s1=new Scanner(System.in);
		
		Employee e1=new Employee();
		
		System.out.print("Enter Employe ID : ");
		e1.eid=s1.nextInt();
		
		System.out.print("Enter Employe name : ");
		e1.ename=s1.next();
		System.out.print("Enter Employe Salary : ");
		e1.esalary=s1.nextInt();
		
		e1.Display();
		e1.DisplayPera();

	}

}
