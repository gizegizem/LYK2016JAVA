package tr.org.linux.kamp2016.gece;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		String input = "";
		Scanner scanner = new Scanner(System.in);

		while (true) {
			MenuHelper.printMenu();
			input = scanner.nextLine();
			String[] parts = input.split(",");
			int choose = Integer.parseInt(parts[0]);
			if (choose == 0) {
				System.out.println("Exiting....");
				System.exit(0);
			}
			if (choose == 1) {
				Todo t = new Todo(parts[1]);
				TodoHelper.add(t);
			}
			if (choose == 2) {
				int index = Integer.parseInt(parts[1]);
				TodoHelper.mark(index-1, true);
			}
			if (choose == 3) {
				int index = Integer.parseInt(parts[1]);
				TodoHelper.remove(index-1);
			}

		}
	}
}
