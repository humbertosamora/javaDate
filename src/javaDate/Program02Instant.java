package javaDate;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Program02Instant {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
	    // Current UTC time
	    Instant utcInstant = Instant.now();
	    System.out.println("Instant (UTC): " + utcInstant);
	    
	    // UTC+09:00
	    ZonedDateTime zdt1 = utcInstant.atZone(ZoneId.of("GMT+9"));
	    System.out.println("GMT" + zdt1.getOffset() + "  ZonedDateTime: " + zdt1.format(dtf));
	    
	    // UTC-05:00
	    ZonedDateTime zdt2 = utcInstant.atZone(ZoneId.of("GMT-5"));
	    System.out.println("GMT" + zdt2.getOffset() + "  ZonedDateTime: " + zdt2.format(dtf));
	    
	    // User computer time zone
	    ZonedDateTime zdt3 = utcInstant.atZone(ZoneId.systemDefault());
	    System.out.println("GMT" + zdt3.getOffset() + "  ZonedDateTime: " + zdt3.format(dtf));
	    
	    // Convert Instant to java Date and print it as formatted string in specific time zone
	    Date utcDate = new Date(utcInstant.toEpochMilli());
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    
	    // UTC
	    sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
	    System.out.println("GMT+00:00 java.util.Date: " + sdf.format(utcDate));
	    
	    // +3 offset
	    sdf.setTimeZone(TimeZone.getTimeZone("GMT+3"));
	    System.out.println("GMT+03:00 java.util.Date: " + sdf.format(utcDate));
	    
	    // +8 offset
	    sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
	    System.out.println("GMT+08:00 java.util.Date: " + sdf.format(utcDate));
	    
	}
	
}
