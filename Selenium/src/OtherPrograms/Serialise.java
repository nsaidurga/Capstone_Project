package OtherPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable{
	int id;
	String name;
	String adress;
	public Employee(int id, String name, String adress) {
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	
}
public class Serialise {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(101,"Sai","Vizag"));
		employees.add(new Employee(105,"Srinu","Parvathipuram"));
		employees.add(new Employee(104,"Sriram","Vijayawada"));
		try {
			FileWriter f=new FileWriter("emp.txt");
			BufferedWriter bw=new BufferedWriter(f);
			for(Employee i:employees) {
				bw.write(i.toString());
				bw.newLine();
			}
			System.out.println("All employees details were stored");
			bw.close();
			f.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
