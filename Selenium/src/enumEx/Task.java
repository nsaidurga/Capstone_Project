package enumEx;

interface Msg{
	void greet();
}
enum Greett implements Msg{
	Hello,Hi;
		public void greet() {
			System.out.println("Greeting from "+this);
		}
}
public class Task {

	public static void main(String[] args) {
		//Greett g=Greett.greet();
		Greett.Hello.greet();
		
	}

}
