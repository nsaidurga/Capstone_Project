package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ProgramAll {

	public static void main(String[] args) throws IOException {
		File f1=new File("programFile.txt");
		if(f1.exists()) {
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.canRead());
			System.out.println(f1.getName());
			System.out.println(f1.length());
			System.out.println(f1.lastModified());
		}
		else {
			f1.createNewFile();
		}
		
		FileWriter f=new FileWriter(f1);
		f.write("Hii kjsfdgwif");


		PrintWriter p=new PrintWriter(new FileWriter(f1,true));
		
		p.write("Hii all of you");
		p.write("\nHellooooooo");
		p.write("\nHow are you");
		p.write("\n");
		p.write("\n");
		p.write("line 5");
		//p.flush();
		p.close();
		
		System.out.println("Write file successfully");
		System.out.println();
		
		FileReader rd=new FileReader("programFile.txt");
		BufferedReader b=new BufferedReader(new FileReader("programFile.txt"));

		List<String> l=new ArrayList<String>();
		String line;
		while((line=b.readLine())!=null) {
			l.add(line);
		}
		for(String s:l) {
			System.out.println(s);
		}
		b.close();
		
	}

}
