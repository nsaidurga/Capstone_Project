package OtherPrograms;

public class Concurrency_problems extends Thread{
	
	public static int amount=0;
	
	public static void main(String[] args) {
		Concurrency_problems t=new Concurrency_problems();
		t.start();
		while(t.isAlive()) {
			System.out.println("Waiting...");
		}
		System.out.println(amount);
		amount++;
		System.out.println(amount);
	}
	public void run() {
		amount++;
	}

}
