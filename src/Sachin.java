
public class Sachin {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		StringBuilder sb1 = new StringBuilder("Tulasi");
		StringBuilder s = sb.append(sb1);
		System.out.println(s.toString());
		
		String str = "tulasi";
		char ch[] = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
			
		}
		
	}

}
