package tr.org.linux.kamp2016.todo_application;
/**
 * this is a 
 * @author gizem
 *
 */
public class TodoMarkException extends Exception{
	String hata="Todo is already ";
	String tip = "TodoMarkException";
	public String toString(){
		return hata +=String.format(":", tip);
	}
}
