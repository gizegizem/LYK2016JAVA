package tr.org.linux.kamp2016.threads;


import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

public class Application {

	public static AtomicInteger globalCounter = new AtomicInteger(1);
	public static Collection<Integer> numbers = new ArrayList<>();

	public static void addToList(int i) {
		System.out.println("adding " + i);
		
		synchronized (numbers) {
			numbers.add(i);
		}
	}

	public static void main(String[] args) {
		Counter t1 = new Counter();
		Thread t2 = new Counter();
		Thread t3 = new Thread(new CounterRunnable());

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(numbers);
		System.out.println(numbers.size());

		System.out.println("Exiting...");
	}
}
