import java.util.Scanner;

public class StringHandle {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		

		StringBuffer sb = new StringBuffer(s);

		StringBuffer str1 = sb.reverse();
		String str2 = str1.toString();
		
		
		
		
		
		if(s.equals(str2)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

		
		

	}

}
