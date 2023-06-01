package collections;
import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		
		/*	1) Heterogenious data - allowed
			2) Insertion order- preserved(Index)
			3) Duplicate elements -- allowed
			4) multiple nulls -- allowed
		 */
		//Declaration of ArrayList.
		ArrayList alist=new ArrayList(); //ArrayList is predefine class.
		// ArrayList <String> alist=new ArrayList<ArraList>();
		//List alist1=new ArrayList();
		alist.add(100);
		alist.add(10.10);
		alist.add("Name");
		alist.add(true);
		alist.add(null);
		alist.add(null);
		alist.add(100);
		
		System.out.println(alist); // to print
		
		// remove value from arraylist
		alist.remove(6); //100 will remove from list
		System.out.println(alist); // to print
		
		// insert value in the middle of array list.
		alist.add(2,200);
		System.out.println(alist);
		

	}

}
