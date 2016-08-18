package tr.org.linux.kamp2016.thread_projects;

import java.util.ArrayList;

import java.util.List;

import tr.org.linux.kamp2016.threads.Counter;

public class Application {
	public static List<Data> currentNanoSecondList = new ArrayList<>();

	public static void addCurrentNanoSecondList(Data data) {

		synchronized (currentNanoSecondList) {
			currentNanoSecondList.add(data);
		}
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static Data getData() {
		synchronized (currentNanoSecondList) {
			if (!currentNanoSecondList.isEmpty()) {
				return currentNanoSecondList.remove(0);
			}
		}
		return null;
	}

	public static void main(String[] args) {

		Thread t1 = new Producer();
		Thread t2 = new Producer();
		Thread t3 = new Producer();
		Thread t4 = new Producer();

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		Thread c1 = new Consumer();
		Thread c2 = new Consumer();
		Thread c3 = new Consumer();
		Thread c4 = new Consumer();

		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}

}
