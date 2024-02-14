import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s = "Tulasi playing cricket";

		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			s = st.nextToken();
		
		System.out.println(s);
		}

}
}