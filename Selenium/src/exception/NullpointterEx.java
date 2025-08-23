package exception;

public class NullpointterEx {
	void run() {
		System.out.println("run fast");
	}
	void run(int age) {
		System.out.println("run");
	}
	public static void main(String[] args) {
		String[] a=new String[3];
		NullpointterEx r=new NullpointterEx();
		
		
		System.out.println(a[0]);
		
		try {
			
			Thread.sleep(-10);//IllegalArgumentException
			NullpointterEx n=null;
			//r.run(-123);
			n.run();
			Object o="sai";
			Integer i=(Integer)o;
			String name=null;
				
			System.out.printf("%d","sai");
			System.out.println(name.length());
			System.out.println(i);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("completed");
		}
	}

}
