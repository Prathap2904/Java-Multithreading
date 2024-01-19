package Threads;

class Cake implements Runnable{
	
	public void cooking() {
		System.out.println("Mixing Ingrediants "+Thread.currentThread().getId());
		System.out.println("Baking the cake "+Thread.currentThread().getId());
		System.out.println("designing the cake  "+Thread.currentThread().getId());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Thread_interface_cooking {

	public static void main(String[] args) {
		
		for(int i=0;i<3;i++) {
		
		Cake cake = new Cake();
		
		Thread cook = new Thread(cake);
		cook.start();
		

	}}

}
