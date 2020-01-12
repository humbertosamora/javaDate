package javaDate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Program04LocalDateTime {

	public static void main(String[] args) {
		
		// Brazil (São Paulo) Time zone
		String strTimeZone = "GMT-3";
		TimeZone.setDefault(TimeZone.getTimeZone(strTimeZone));

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		
		LocalDateTime localDate1 = LocalDateTime.of(2019, 11, 22, 22, 50, 13);
				
		System.out.println("Date1: " + localDate1.format(fmt));
		System.out.println("Date1 plus 1 day: " + localDate1.plusDays(1).format(fmt));
		System.out.println("Date1 plus 1 month: " + localDate1.plusMonths(1).format(fmt));
		System.out.println("Date1 plus 1 year: " + localDate1.plusYears(1).format(fmt));
		
		// Create a LocalDateTime based on Instant object and a given timezone
		LocalDateTime localDate2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.of(strTimeZone));
		
		System.out.println();
		System.out.println("Now: " + localDate2.format(fmt));
		
	}

}
