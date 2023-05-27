package Day2;

public class Array_two_DIa {
	public static void main(String[] args) {
		//declaration
		//approach 1
		/*
		int a[][]=new int[3][2];
		
		//insert value
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		//approach 2
		int a[][]= {{100,200},{300,400},{500,600}};
		
		//length of array
		System.out.println(a.length); 		//indicate Column
		System.out.println(a[0].length); 	//indicate rows
		
		int column=a.length;
		
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a[r].length;c++) {
				System.out.print("| "+a[r][c]+" | ");
			}
			System.out.println();
		}
		
	// inhance for loop
		for(int x[]:a){
			for (int v:x){
				System.out.print(v+" ");
			}
			System.out.println();
		}
		
		
		
	
	}

}
