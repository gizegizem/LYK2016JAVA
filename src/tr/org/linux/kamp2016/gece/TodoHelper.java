package tr.org.linux.kamp2016.gece;

import java.util.ArrayList;
import java.util.List;

public class TodoHelper {
	private static List<Todo> list = new ArrayList<>();
	
	public static void add(Todo todo){
		list.add(todo);
	}
	
	public static void mark(int index,boolean isChecked){
		list.get(index).setDone(isChecked);	
	}
	
	public static void remove(int index){
		list.remove(index);
	}

	public static List<Todo> getList() {
		return list;
	}
	
	
	
	
}
