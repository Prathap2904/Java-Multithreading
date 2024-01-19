package Collection;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<Integer>a = new HashSet<Integer>();
		
		a.add(10);
		a.add(12);
		a.add(22);
		a.add(22);
		
		for(int i:a) {
			System.out.println(i);
		}
		

	}

}
