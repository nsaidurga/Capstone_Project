package OtherPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerEx {

	public static void main(String[] args) {
		try {
			File f=new File("C:\\saiweb\\sele.txt");
			Scanner myReader=new Scanner(f);
			
			while(myReader.hasNextLine()) {
				String data=myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Errror Raised");
			e.printStackTrace();
		}
	}

}
