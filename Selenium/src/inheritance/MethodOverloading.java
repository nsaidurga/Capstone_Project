package inheritance;
//Method overloading
public class MethodOverloading {
	void details(int rollno)
	{
		System.out.println("Rollno="+rollno);
	}
	
	void details(int rollno,String name)
	{
		System.out.println("Rollno="+rollno);
		System.out.println("Name ="+name);
	}
	void details(String name,int rollno)
	{
		System.out.println("Name ="+name);
		System.out.println("Rollno="+rollno);		
	}
	void details(int rollno,String name, float per)
	{
		System.out.println("Rollno="+rollno);
		System.out.println("Name ="+name);
		System.out.println("Percentage="+per);
	}
 
	public static void main(String[] args) {
		MethodOverloading stud=new MethodOverloading();
		System.out.println("***student  rollno********");
		stud.details(101);
		System.out.println("***student rollno and name********");
		stud.details(102, "Neeva Sharma");
		System.out.println("***student name and rollno********");
		stud.details("Reeva Verma", 103);
		System.out.println("***student rollno, name and percentage********");
		stud.details(104, "Shiva Upadhyay", 89.9f);
 
	}
 
}
 
 