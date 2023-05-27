package Day2;

import java.util.Arrays;

public class Array_demo {
	public static void main(String[] args) {
		//Declare array
		
		//int a[]=new int[5];
		
		//insert value in array, two ways for that.
		/* approach 1
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		*/
		// approach 
		int a[]= {10,20,30,40,50};
		
		
		//size or find length for array
		
		System.out.println(a.length);
		//print value
		System.out.println(a[2]);
		
		//get all value from array
		System.out.println(Arrays.toString(a));
		
		/*
		int b=a.length;
		for (int i=0;i<b;i++) {
			System.out.println(a[i]);
		} */
		
		//read data using inhance for loop
		for (int x:a) {
			System.out.println(x);
		}
	}

}
