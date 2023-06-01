package collections;
import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) 
	{
		/*	1) Heterogenios data ---> allowed
			2) Insertion order  --> Not preserved (Index not supported)
			3) Duplicate elements --> Not Allowed
			4) Multiple nulls Not allowed/ only single null is allowed
			//insertion is not possible 
		 * */
		// Declaration Hashset
		HashSet hset=new HashSet();
		// Set hset=new HashSet();
		//to store only integer. 
		//HashSet <Integer>hset=new HashSet<Integer>HashSet();
		
		//add value
		hset.add(100);
		hset.add(20.20);
		hset.add("Name");
		hset.add(true);
		hset.add(null);
		
		System.out.println(hset);
		
		//Remove value
		
		hset.remove(20.20); // to remove we need to enter value not index. 
		System.out.println("After remove 20.20 "+hset);
				for (Object x:hset)
		{
			System.out.println(x);
		}
		

	}

}
