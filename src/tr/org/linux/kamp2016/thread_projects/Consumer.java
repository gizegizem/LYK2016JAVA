package tr.org.linux.kamp2016.thread_projects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Consumer extends Thread {

	@Override
	public void run() {
		while (true) {
			Data data = Application.getData();
			if (data != null) {
				try {
					writeToFile(data.toString(),
							"/home/gizem/Masaüstü/file.txt",
							StandardOpenOption.APPEND);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void writeToFile(String hede, String pathAndFile,
			StandardOpenOption append) throws IOException {

		Files.write(Paths.get(pathAndFile), hede.getBytes(),
				StandardOpenOption.APPEND);
	}
}
