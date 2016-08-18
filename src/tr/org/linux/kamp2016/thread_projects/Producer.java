package tr.org.linux.kamp2016.thread_projects;

public class Producer extends Thread {

	@Override
	public void run() {
		while (true) {
			long currentNanoSecond = System.nanoTime();
			Application.addCurrentNanoSecondList(new Data(currentNanoSecond));
		}
	}

}
