package day2;

public class Array_Object_type {

	public static void main(String[] args) {
		// Object type array means you can store all type of data in array
		
		Object a[]=new Object[5];
		a[0]="Prins";
		a[1]=26;
		a[2]="canada";
		a[3]=17.50;
		a[4]='C';
		for (Object i:a) {
			System.out.println(i);
			
		}
	}

}
