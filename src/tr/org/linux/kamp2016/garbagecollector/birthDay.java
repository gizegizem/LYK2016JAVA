package tr.org.linux.kamp2016.garbagecollector;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class birthDay {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Birthday Date: ");
		int day = input.nextInt();
		System.out.println("Please enter your Birthday Month: ");
		int month = input.nextInt();
		System.out.println("Please enter your Birthday Year: ");
		int year = input.nextInt();
		
		//LocalDateTime currentTime = LocalDateTime.now();
		//LocalDate birthDate = LocalDate.of(year, month, day);
		long daysAlive = ChronoUnit.DAYS.between(LocalDate.of(year, month, day),LocalDateTime.now());
		System.out.println("Your lives for "+daysAlive+" days!");

	}

}
