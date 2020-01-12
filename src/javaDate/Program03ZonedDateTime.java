package javaDate;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Program03ZonedDateTime {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		// Parse a ZonedDateTime from string in given ZoneId
	    ZonedDateTime zdt1 = ZonedDateTime.parse("2020-01-12 15:17:00", dtf.withZone(ZoneId.of("GMT-5")));
	    
	    // Parse a ZonedDateTime from string in system default ZoneId
	    ZonedDateTime zdt2 = ZonedDateTime.parse("2020-01-12 15:17:00", dtf.withZone(ZoneId.systemDefault()));
	    
	    // Print ZonedDateTime
	    System.out.println("GMT" + zdt1.getOffset() + ": " + zdt1.format(dtf));
	    // Print UTC Instant corresponding to given ZonedDateTime
	    System.out.println("GMT+00.00: " + zdt1.toInstant());
	    
	    System.out.println();
	    
	    // Print ZonedDateTime
	    System.out.println("GMT" + zdt2.getOffset() + ": " + zdt2.format(dtf));
	    // Print UTC Instant corresponding to given ZonedDateTime
	    System.out.println("GMT+00.00: " + zdt2.toInstant());
	    
	}
	
}
