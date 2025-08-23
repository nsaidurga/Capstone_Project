package enumEx;
interface Vehicle{
	void speed();
}
enum Car implements Vehicle{
	bike{
		public void speed() {
			System.out.println("Car runs faster");
		}
		
	}
};

public class enumInterface {
		
	public static void main(String[] args) {
		Car c=Car.bike;
		c.speed();
	}
}
