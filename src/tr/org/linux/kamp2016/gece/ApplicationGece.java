package tr.org.linux.kamp2016.gece;

import java.util.Scanner;

public class ApplicationGece {
	public static void main(String[] args) {
		String input = "";
		Scanner scanner = new Scanner(System.in);

		while (true) {
			MenuHelperGece.printMenu();
			input = scanner.nextLine();
			String[] parts = input.split(",");
			int choose = Integer.parseInt(parts[0]);
			if (choose == 0) {
				System.out.println("Exiting....");
				System.exit(0);
			}
			if (choose == 1) {
				TodoGece t = new TodoGece(parts[1]);
				TodoHelperGece.add(t);
			}
			if (choose == 2) {
				int index = Integer.parseInt(parts[1]);
				TodoHelperGece.mark(index-1, true);
			}
			if (choose == 3) {
				int index = Integer.parseInt(parts[1]);
				TodoHelperGece.remove(index-1);
			}

		}
	}
}
