package fileHandling;

import java.io.File;

public class CreateNewFile {

	public static void main(String[] args) {
		File f=new File("normal.txt");
		//File f=new File("f.txt");
		try {
			f.createNewFile();//create new file
			System.out.println(f.setWritable(true));
		}
		catch(Exception e) {
			System.out.println("File not found");
			System.out.println(e);
		}
	}

}
