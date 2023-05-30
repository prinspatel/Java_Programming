package practice_Test;

public class reverse_string {

	public static void main(String[] args) {
		String s="Welcome";
		int l=s.length();
		String rev="";
		
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);	
		}
		System.out.println(rev);

	}

}
