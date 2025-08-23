package multithreading;

class Practice extends Thread {
	
	
	public void run() {
		boolean flag = true;
		while (flag) {
			System.out.println("Thread is running");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		} 
		System.out.println("Thread stopped");
	}
	public void stopThread() {
		boolean flag=false;
	}

}

public class FlagThread {

	public static void main(String[] args) {
		// boolean flag=false;
		Practice p = new Practice();
		
		p.stopThread();
		//p.start();
		

	}

}
