package enumEx;

interface Hospital{
	void doctor();
}
enum Nurse implements Hospital{
	doc{
		public void doctor() {
			System.out.println("Doctor will soon");
		}
	};
}
public class EnumEx {

	public static void main(String[] args) {
		Nurse n=Nurse.doc;
		n.doctor();
		Nurse.doc.doctor();
	}

}
