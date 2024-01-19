package Threads;
class Cakecount{
	int cakecount = 1;
	
	public synchronized void increment() {
		cakecount++;
	}
}
class Team implements Runnable{
	
	Cakecount count;
	
	Team(Cakecount count){
		this.count = count;
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			count.increment();
		}
	}
}
public class Synchronized {

	public static void main(String[] args) {
		Cakecount count = new Cakecount();
		
		Thread velvet = new Thread(new Team(count));
		Thread lava = new Thread(new Team(count));
		velvet.start();
		lava.start();
		
		try {
			velvet.join();
			lava.join();
		}
		catch(Exception e) {
			
		}
		
		System.out.println(count.cakecount);
	}

}
