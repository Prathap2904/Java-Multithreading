package Threads;

class Cake extends Thread{
	public void run() {
		System.out.println("Mixing the ingredients "+Cake.currentThread().getId());	
		System.out.println("Baking the cake  "+Cake.currentThread().getId());	
		System.out.println("Designing the cake "+Cake.currentThread().getId());
	}
}

public class Thread_Booking {

	public static void main(String[] args) {
		int cakecount = 3;
		
		for(int i=0;i<cakecount;i++) {
			Cake velvet = new Cake();
			velvet.run();
		}

	}

}
