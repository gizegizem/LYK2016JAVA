package tr.org.linux.kamp2016.bookproject;

public class EBook extends Book {
	double fileSize;
	String encodingFormat;
	int numDevicesBeingUsed=0;
	int counterRemove=0;
	int counterAdd=0;
	public EBook(String name, String author, double price, String bookId,
			double fileSize, String encodingFormat, int numDevicesBeingUsed) {
		super(name, author, price, bookId);
		this.fileSize = fileSize;
		this.encodingFormat = encodingFormat;
		this.numDevicesBeingUsed = numDevicesBeingUsed;
	}
	public double getFileSize() {
		return fileSize;
	}
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	public String getEncodingFormat() {
		return encodingFormat;
	}
	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}
	public int getNumDevicesBeingUsed() {
		return numDevicesBeingUsed;
	}
	public void setNumDevicesBeingUsed(int numDevicesBeingUsed) {
		if(this.numDevicesBeingUsed <=0){
			this.numDevicesBeingUsed=0;
		}
		counterAdd++;
		this.numDevicesBeingUsed = numDevicesBeingUsed;
	}
	
	public boolean addDevice(){
		if(counterAdd>0)
			return true;
		else
			return false;
	}
	public boolean removeDevice(){
		/****/
	}
	
	
}
