package practice_Test;

public class Find_Largest_Number {
	public static void main(String[] args) {
		// FInd largest Number from a, b and c using operator and if statement.
		
		int a=100, b=200, c=300;
		if ((a>b) && (a>c)){
			System.out.println("A is the Largest Number");
		}
		else if((b>a)&&(b>c)) {
			System.out.println("B is the Largest Number");
		}
		else {
			System.out.println("C is the Largest Number");
		}
	}

}
