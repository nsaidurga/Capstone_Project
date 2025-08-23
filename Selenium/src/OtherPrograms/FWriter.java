package OtherPrograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FWriter {

	public static void main(String[] args) {
		try {
			File f=new File("C:\\saiweb\\sele.txt");
			
			FileWriter fw=new FileWriter(f);
			fw.write("File in Java adding Financial text super easy");
			fw.close();
			System.out.println("Successfully written to the file");
		}
		catch(IOException e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
	}

}
