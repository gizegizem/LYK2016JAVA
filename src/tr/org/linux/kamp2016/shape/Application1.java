package tr.org.linux.kamp2016.shape;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Application1 {

	public static void main(String[] args) throws IOException {
		String[] in;
		in = FileHelper1.readFile("/home/gizem/Masaüstü/Shape/input.txt");
	
		int weight = Integer.parseInt(in[0]);
		int height = Integer.parseInt(in[1]);
		String str = in[2];
		char character =str.charAt(0);

		Shape1 shape = new Shape1(height, weight, character);
		Shape1.getShape(shape);

	}

	
}
