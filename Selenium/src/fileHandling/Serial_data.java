package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Serial_data {

	public static void main(String[] args) {
		Employee emp=new Employee(101,"Manikanta");
		Employee emp1=new Employee(213,"Nikhil");
		try {
			FileWriter fw=new FileWriter("employee.txt"); 
			BufferedWriter bf=new BufferedWriter(fw);
			bf.write(emp.toString());
			bf.newLine();
			bf.write(emp1.toString());
			bf.newLine();
			bf.close();
			fw.close();
			System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

/*
try {
	FileOutputStream fos=new FileOutputStream("employee.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(emp);
	oos.close();
	fos.close();
	System.out.println("Done");
}
catch(Exception e) {
	System.out.println(e);
}*/