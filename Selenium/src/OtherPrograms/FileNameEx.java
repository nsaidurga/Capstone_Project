package OtherPrograms;

import java.io.File;

public class FileNameEx {

	public static void main(String[] args) {
		File f=new File("C:\\saiweb\\sele.txt");
		if(f.exists()) {
			System.out.println("File Name: "+f.getName());
			System.out.println("Absolute Path: "+f.getAbsolutePath());
			System.out.println("File Name: "+f.canWrite());
			System.out.println("File Name: "+f.canRead());
			System.out.println("File Name: "+f.length());
		}
		else {
			System.out.println("File Not Found..");
		}
		
		/*if(f.delete()) {
			System.out.println("File deletd succfully "+f.getName());
		}
		else {
			System.out.println("File Not Found...");
		}*/
	}

}
