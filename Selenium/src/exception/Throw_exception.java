package exception;

public class Throw_exception {

	public static void main(String[] args) {
		String name=null;
		if(name==null) {
			throw new NullPointerException("Name is not null");
		}
		System.out.println(name.length());
	}

}
