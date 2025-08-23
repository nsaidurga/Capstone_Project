package fileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocFile {

	public static void main(String[] args) throws IOException {
		
		List<String> lines=new ArrayList<>();
		FileInputStream r=new FileInputStream("C:\\Users\\sai durga\\Downloads\\saidurga.docx");
		//BufferedReader r=new BufferedReader(new FileReader("normal.txt"));
		int line;
		while((line=r.read())!=-1) {
			System.out.println((char)line);
		}
		for(String l:lines) {
			System.out.println(l);
		}
		r.close();
	}

}
