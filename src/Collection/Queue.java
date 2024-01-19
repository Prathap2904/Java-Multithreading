package Collection;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue<String>name = new PriorityQueue<String>();
		
		name.add("Prathap");
		name.add("Mechatronics");
		name.add("Erode");
		name.poll();
		name.peek();
		
		System.out.println(name);
	}

}
