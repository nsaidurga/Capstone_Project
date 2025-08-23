package fileHandling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		Path path=Paths.get("sample.txt");
		System.out.println("Name of file:"+path.getFileName());
		System.out.println("Absolute Path:"+path.toAbsolutePath());
		System.out.println("Parent Directory:"+path.getParent());
		System.out.println("Path(current:"+Files.exists(path));
	}

}
