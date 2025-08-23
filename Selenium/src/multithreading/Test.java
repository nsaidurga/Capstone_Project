package multithreading;

class Test1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Welcome");
		}
		System.out.println("Current Test thread name: " + Thread.currentThread().getName());
		Thread.currentThread().setName("Test1 thread");
		System.out.println("After assign Test thread name: " + Thread.currentThread().getName());
		//System.out.println("Test1 id: "+Thread.currentThread().getId());
		System.out.println("Test1 priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(3);
		System.out.println("Test1 priority: "+Thread.currentThread().getPriority());
		System.out.println("Test1 thread status: "+Thread.currentThread().isAlive());
	}
}

public class Test extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
		}
		System.out.println("Current Test thread name: " + Thread.currentThread().getName());
		Thread.currentThread().setName("Test thread");
		System.out.println("After assign Test thread name: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Test t = new Test();
		Test1 t1 = new Test1();
		t.start();
		t1.start();
	}

}
