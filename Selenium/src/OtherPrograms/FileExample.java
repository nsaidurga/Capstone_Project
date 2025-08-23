package OtherPrograms;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		
		try {
			File f=new File("C:\\saiweb\\sele.txt");
			if(f.createNewFile()) {
				System.out.println("File created:"+f.getName());
			}
			else {
				System.out.println("File Already Exists");
			}
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		
	}

}
