package interfacePackage;

interface Even{
	boolean isEven(int n);
}
public class LambdaEven {

	public static void main(String[] args) {
		Even e=(n)->n%2==0;
		System.out.println(e.isEven(12));
	}

}
