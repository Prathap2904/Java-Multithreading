package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(8);
		al.add(9);
		al.add(4);
		al.add(1);
		al.add(8);
		
		al.remove(0);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Prathap");
		name.add("Erode");
		name.add("Mechatronics");
		
		Collections.sort(name);
		
		for(String i:name) {
		
		System.out.println(i);
		}
	}

}
