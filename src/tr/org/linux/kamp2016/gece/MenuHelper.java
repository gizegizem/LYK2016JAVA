package tr.org.linux.kamp2016.gece;

import java.util.Iterator;

import tr.org.linux.kamp2016.gece.Todo;

public class MenuHelper{

	public static void printMenu() {
		StringBuilder str = new StringBuilder(50);

		Iterator<Todo> it =TodoHelper.getList().iterator();

		str.append("TODOs\n");
		str.append("============");
		str.append("\n");
		
		for (int i=0;i<TodoHelper.getList().size();i++) {
			Todo t = it.next();
			str.append("(");
			str.append(i + 1);
			str.append(") ");
			str.append(t.getChecked());
			str.append(t.getDescription());
			str.append("\n");
		}
		str.append("\n");
		str.append("MENU\n");
		str.append("=============");
		str.append("(0)-Exit\n");
		str.append("(1)-Add Todo item\n");
		str.append("(2)-Mark as Done\n");
		str.append("(3)-Remove item\n");
		str.append("Enter your command: ");
		
		System.out.println(str.toString());
	}
}
