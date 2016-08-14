package tr.org.linux.kamp2016.projects;

public abstract class BinaryFile extends File {

	public BinaryFile(String fName, long fSize) {
		super(fName, fSize);
	}

	public abstract BinaryFile getCopy();
}