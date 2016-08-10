package tr.org.linux.kamp2016.garbagecollector;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeAPI {
	
	public void testLocalDateTime(){
		
	LocalDateTime currentTime = LocalDateTime.now();
	
	System.out.println("Şuanki  Tarih: " + currentTime);
	
	Month month= currentTime.getMonth();
	int day = currentTime.getDayOfMonth();
	int seconds = currentTime.getSecond();
	
	System.out.println("Ay: "+month+"Gün: "+day+"Saat: "+ seconds);
	
	LocalDateTime timeExample = currentTime.withDayOfMonth(8).withYear(2016);
	System.out.println("timeExample: "+timeExample);
	
	LocalDate dateExample = LocalDate.of(2016, Month.AUGUST, 10);
	System.out.println("dateExample: "+dateExample);
	
	LocalTime anotherTimeExample = LocalTime.of(20, 45);
	System.out.println("anotherTimeExample: "+anotherTimeExample);
	
	LocalTime justAnotherLocalTimeExample = LocalTime.parse("19:20:15");
	System.out.println("justAnotherLocalTimeExample: "+justAnotherLocalTimeExample);
	
	//2.Kısım
	
	
	
	}

}
