package tr.org.linux.kamp2016.shape;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileHelper1 {

	public static String[] readFile(String pathAndFile) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(pathAndFile));
		String input = lines.get(0);
		return input.split(",");
	}
	
}
