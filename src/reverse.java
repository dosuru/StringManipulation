import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverse {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(2);
		list.add(1);
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
		
		
		

	}

}
