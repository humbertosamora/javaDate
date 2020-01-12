package javaDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Program01Date {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		// Current UTC time
		Date date = new Date(System.currentTimeMillis());
				
		// Set Brazil (São Paulo) time zone (-3 hours)
		sdf.setTimeZone(TimeZone.getTimeZone("GMT-3:00"));
		System.out.println(sdf.format(date));
		
		// Set UTC time zone (+0 hours)
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(sdf.format(date));
		
		// Parse date from string in specific time zone. If time zone is not set, system.default is used.
		sdf.setTimeZone(TimeZone.getTimeZone("GMT-3:00"));
		Date date1 = sdf.parse("20/11/1979 02:53:00");
		System.out.println(sdf.format(date1));
		
		// Set UTC time zone
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(sdf.format(date1));
	}
}
