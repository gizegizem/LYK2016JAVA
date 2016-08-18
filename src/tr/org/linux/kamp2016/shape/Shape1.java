package tr.org.linux.kamp2016.shape;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Shape1 {
	private static int weight;
	private static int height;
	private static char character;
	
	public Shape1(int weight, int height, char character) {
		this.weight = weight;
		this.height = height;
		this.character = character;
	}
	
	public static int getWeight() {
		return weight;
	}
	public static void setWeight(int weightt) {
		weight = weightt;
	}
	public static int getHeight() {
		return height;
	}
	public static void setHeight(int heightt) {
		height = heightt;
	}
	public static char getCharacter() {
		return character;
	}
	public static void setCharacter(char characterr) {
		character = characterr;
	}
	
	public static void getShape(Shape1 s) throws FileNotFoundException, UnsupportedEncodingException{
		Path file = Paths.get("/home/gizem/Masaüstü/Shape/output.txt");
		PrintWriter writer = new PrintWriter("/home/gizem/Masaüstü/Shape/output.txt","UTF-8");
		for(int w =0;w <getWeight();w++){
			writer.print(getCharacter());
			for(int h=1;h<getHeight();h++){
				
				writer.print(getCharacter());
			}
			writer.print("\n");
		}
		writer.close();
	}
}
