package multithreading;
class Simple{
	void waitforsignals() throws InterruptedException{
		synchronized(this) {
			System.out.println("Waiting");
			wait();
			System.out.println("Resume");
		}
	}
	void givesignal() {
		synchronized(this) {
			notify();
		}
	}
}
public class NotifyWait {

	public static void main(String[] args) {
		Simple s=new Simple();
		Thread t1=new Thread(()->{
			try {
				s.waitforsignals();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		});
		Thread t2=new Thread(()->{
			try {
				Thread.sleep(1000);
				s.givesignal();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		});
		
		t1.start();
		t2.start();
	}

}
