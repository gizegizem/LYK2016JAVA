package tr.org.linux.kamp2016.threads;


public class CounterRunnable implements Runnable {

	private int count = 100;

	@Override
	public void run() {
		addIntegerToList();
	}
	
	private void selfCounter(){
		for (int i = 0; i < count; i++) {
			System.out.println(Thread.currentThread().getName() + " count: " + i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void globalCounter(){
		for (int i = 0; i < count; i++) {
			System.out.println(Thread.currentThread().getName() + " count: " + Application.globalCounter.getAndIncrement());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void addIntegerToList(){
		for (int i = 0; i < count; i++) {
			Application.addToList(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}