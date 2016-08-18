package tr.org.linux.kamp2016.shape;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Deneme 
{
public static void main(String[] args) throws IOException {
	
	
		readFile("/home/gizem/input.txt");
	}

public static void readFile(String pathAndFile) throws IOException {

	List<String> lines = Files.readAllLines(Paths.get(pathAndFile));

	for (String line : lines) {
		System.out.println(line);
	}
}
}
//{
//	try{
//	 FileReader fr = new FileReader("input.txt");
//     BufferedReader br = new BufferedReader(fr);
//   
//     String str;
//
//         while ((str=br.readLine())!=null) 
//         {
//                 System.out.println(str);
//             }
//           br.close();
//}
//	catch(IOException e){
//		System.out.println("Dosya okunamadı.");
//	}





