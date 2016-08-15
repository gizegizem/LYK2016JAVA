package tr.org.linux.kamp2016.gece;

public class Todo {
	private String description;
	private boolean done;

	public Todo(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getChecked() {
		return done ? "☑" : "☐";
	}

}
