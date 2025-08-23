package fileHandling;

import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter w=new FileWriter("normal.txt");
			w.write("Hello");
			w.write("Welcome to Java Learning sessions");
			w.close();
			System.out.println("Write file successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
