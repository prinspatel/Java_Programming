package practice_Test;

import java.util.Arrays;

public class Sort_Element_in_Array {
	public static void main(String[] args) {
		int a[]= {5,2,1,4,3};
		System.out.println("Array befor Sorting"+Arrays.toString(a));
		
		int b=a.length;
		
		for(int i=0;i<b-1;i++) {
			for(int j=0;j<b-1;j++) {
				
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array After Sorting"+Arrays.toString(a));

	}
}
