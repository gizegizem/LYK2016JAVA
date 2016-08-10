package tr.org.linux.kamp2016.helloworld;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {

		HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Öğrenci sayısını giriniz: ");
		Integer student = input.nextInt();
		generateRandomValues(table, student);
		printTable(table);
		System.out.println("mean = " + mean(table));
	}

	private static void generateRandomValues(HashMap<Integer, Integer> map,
			int size) {

		for (int i = 1; i <= size; i++) {
			int randomPoint = randomIntegerRandom(0, 100);
			map.put(i, randomPoint);
		}

	}

	public static double mean(HashMap<Integer, Integer> map) {
		double answer = 0;
		for (int i = 1; i <= map.size(); i++) { // for(Integer i:map.keySet())    for(Integer i:map.Values())
			answer += map.get(i);
		}
		return answer / map.size();
	}

	public static void printTable(HashMap<Integer, Integer> map) {

		for (int i = 1; i <= map.size(); i++) // for(Integer i:map.keySet())
		{
			System.out.println("Student " + i + ": " + map.get(i));
		}
	}

	public static int randomIntegerRandom(int min, int max) {
		Random rgen = new Random();
		int range = Math.abs(max - min) + 1;
		int random = min + rgen.nextInt(range);
		return random;
	}
}
