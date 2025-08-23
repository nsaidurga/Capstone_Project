package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Use {

	public static void main(String[] args) throws IOException {
		PrintWriter w=new PrintWriter(new FileWriter("normal.txt"));
		w.write("Hello\n");
		//w.newLine();
		w.write("Welcome to \njava learning sessions");
		w.write("Java is simple \nfor all the learners\n");
		w.write("line 4\n");
		w.write("\n");
		w.write("line 6");
		w.close();
		System.out.println("Write file successfully");
	}

}
