package tr.org.linux.kamp2016.todo_application;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		String input = "";
		Scanner scanner = new Scanner(System.in);
		String trimInput = "";
		while (true) {
			Menu.printMenu();
			input = scanner.nextLine();
			trimInput = input.trim();
			if (input.isEmpty()) {
				System.out.println("ERROR : Input can not be null!\n");
				continue;
			}
			if (!input.contains(",") && !trimInput.equals("0")) {
				System.out.println("ERROR :Your input contains ',' !\n");
				continue;
			}

			processInput(trimInput);
		}

	}

	private static void processInput(String input) {

		String[] inputParams = input.split(",");

		int action = -1;

		try {
			action = Integer.parseInt(inputParams[0].trim());
			if(action>4){System.out.println("ERROR: Action is not greater than 4! ");}
		} catch (NumberFormatException e) {
			System.out.println("ERROR : Action must be number");
			return;

		}
		String param = null;
		if (inputParams.length > 1) {
			param = inputParams[1].trim();
		}
		
		int index = 0;
		if (action != 0 && action != 1) {
			try {
				index = Integer.parseInt(param);
			} catch (NumberFormatException e) {
				System.out.println("ERROR: Param must be a number\n");
				return;
			}
		}

		switch (action) {
		case 0:
			System.out.println("Exiting...");
			System.exit(0);
		case 1:
			Todo newTodo = new Todo(param);
			TodoHelper.add(newTodo);
			break;
		case 2:
			try {
				TodoHelper.mark(index - 1, true);
			} catch (TodoMarkException e) {
				System.out.println(e.toString());
			}
			break;
		case 3:
			TodoHelper.remove(index - 1);
			break;
		case 4:
			try {
				TodoHelper.mark(index - 1, false);
			} catch (TodoMarkException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
			break;
		default:
			break;
		}

	}

}
