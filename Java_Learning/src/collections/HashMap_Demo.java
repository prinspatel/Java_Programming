package collections;
import java.util.HashMap;

public class HashMap_Demo 
{
	public static void main(String[] args)
	{
		/*	HashMap - a class implemented Map interface
			--------------
			Data can be stored in the form of key, value pairs.
			Key is unique. But we can have duplicate values.
			Insertion order not preserved(Index not followed)
			if use same key then the new value replace with old one.
			
			Declaration 
			-key,value
			-key,value
			-key,value
		*/
		
		//Declaration 
		HashMap hm=new HashMap();
		//Map hm=new HashMap();
		
		//If you want datatype. 
		//HashMap <Integer, String> hm=new HashMap<Intger. String)();
		
		//ad data into HashMap
		
		hm.put(001,"Prins");
		hm.put(002,"Janvi");
		hm.put(003, "XYZ");
		hm.put(004, "abc");
		
		System.out.println(hm);
		
		//remove value
		hm.remove(003);
		System.out.println("3 = xyz removed "+hm);
		
		//print only keys
		
		System.out.println("Only keys will p"+hm.keySet());
		for (Object k:hm.keySet())
		{
			System.out.println("Key is "+k+" and value of Key is "+hm.get(k));
		}
		
	}
}
