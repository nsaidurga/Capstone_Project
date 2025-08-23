package fileHandling;

import java.io.Serializable;

public class Employee implements Serializable{
	int id;
	String name;
	//String adress;
	public Employee(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
		//this.adress=adress;
	}
	public String toString() {
		return id+" "+name;
	}
	
}
