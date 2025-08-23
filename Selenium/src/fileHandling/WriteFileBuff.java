package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFileBuff {

	public static void main(String[] args) {

		try {
			BufferedWriter w = new BufferedWriter(new FileWriter("normal.txt"));
			w.write("Hello");
			w.newLine();
			w.write("Welcome to java learning sessions");
			w.close();
			System.out.println("Write file successfully");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
