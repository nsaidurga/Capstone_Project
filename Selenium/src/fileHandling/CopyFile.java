package fileHandling;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("new.txt");
		if (Files.exists(p)) {
			PrintWriter w = new PrintWriter(new PrintWriter("new.txt"));
			w.write("how are you");
			w.close();
		} else {
			// create new file
			Files.createFile(p);
			System.out.println("File created");
		}
		// copy file
		Path copypath = Paths.get("user.txt");
		Files.copy(p, copypath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File copied");

		/*
		 * PrintWriter w=new PrintWriter(new PrintWriter("user.txt"));
		 * w.write("Hi alll how are you"); w.write("i am a student");
		 */
		// w.close();

		// move file
		Path moved = Paths.get("movedFile.txt");
		Files.move(copypath, moved, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File moved");

		// delete file
		Files.deleteIfExists(p);
		Files.deleteIfExists(moved);
		System.out.println("Files deleted.");
		
		
	}

}
