package tr.org.linux.kamp2016.todo_application;


import java.util.Iterator;

import tr.org.linux.kamp2016.todo_application.Todo;
import tr.org.linux.kamp2016.todo_application.TodoHelper;

public class Menu {

	public static void printMenu(){
		StringBuilder menu = new StringBuilder(50);
		
		menu.append("TODOs\n");
		menu.append("=====\n");
		menu.append("\n");
		Iterator<Todo> it =TodoHelper.getIterator();
		
		//TODO use TodoHelper's getIterator method here
		// hint: use a while loop
		int index=0;
		while(it.hasNext()){
			Todo local = it.next();
				
			// TODO add checkbox according to 'done' status
			// TODO add index numbers for users to choose
			menu.append("(");
			menu.append(++index);
			menu.append(") ");
			menu.append(local.getCheckbox());
			menu.append(" ");
			menu.append(local.getDescription());
			menu.append("\n");
		}
	
		menu.append("\n");
		menu.append("MENU\n");
		menu.append("=====\n");
		menu.append("(0) Exit\n");
		menu.append("(1) Add Todo\n");
		menu.append("(2) Mark as done\n");
		menu.append("(3) Remove todo\n");
		menu.append("\n");
		menu.append("Enter your command: ");
		
		System.out.println(menu.toString());
	}

}

