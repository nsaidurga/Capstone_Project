package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) throws IOException{
		List<String> lines=new ArrayList<>();
		BufferedReader r=new BufferedReader(new FileReader("normal.txt"));
		String line;
		while((line=r.readLine())!=null) {
			lines.add(line);
			//System.out.println(line);
		}
		for(String l:lines) {
			System.out.println(l);
		}
		r.close();
	}

}
