package enumEx;

enum Day{MONDAY,SATURDAY}
public class TestEnum {

	public static void main(String[] args) {
		Day today=Day.SATURDAY;
		Day todaym=Day.MONDAY;
		
		System.out.println("today is = "+today);
		System.out.println("day after tommorrow is = "+todaym);
	}

}
