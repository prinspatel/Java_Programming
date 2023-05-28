package day2;

public class Brack_and_Continue {
	public static void main(String[] args) {
		
	
	//Brack command use to brack point and move to next block
	// print 1 to 5 and brack from 3.
	
	for (int i=1;i<=5;i++) {
		
		System.out.println(i);
		// after print 3 loop break. if we wrote if statement before print value statement will break before print 3
		if (i==3) {
			break;
		}
	}
	
	System.out.println("Continue Command :");
	// now Continue command. it will use to skip value. Example we will skim Number 3 in loop.
	
	for (int f=1;f<=5;f++) {
		if (f == 3) {
			continue;
		}
		System.out.println(f);
	}
	}
}
