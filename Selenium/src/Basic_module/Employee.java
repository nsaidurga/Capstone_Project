package Basic_module;

public class Employee {
	Employee(){
		System.out.println("Default constructor");
	}
	Employee(int id,String name){
		System.out.println("Id is = "+id);
		System.out.println("Name is = "+name);
	}
	Employee(String name,int id){
		System.out.println("Name is = "+name);
		System.out.println("Id is = "+id);
	}
	Employee(String name,int id,float sal){
		System.out.println("Name is = "+name);
		System.out.println("Id is = "+id);
		System.out.println("Salary is = "+sal);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee("Sai",112);
		Employee e2=new Employee("Kalyan",213);
		Employee e3=new Employee("Ashok",321,45000);
	}

}
