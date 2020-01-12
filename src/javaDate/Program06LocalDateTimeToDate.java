package javaDate;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Program06LocalDateTimeToDate {
	public static void main(String[] args) {
		
		// Brazil Time zone
		String strTimeZone = "GMT-3";
		TimeZone.setDefault(TimeZone.getTimeZone(strTimeZone));
		
		// Local Date
		LocalDateTime localDate = LocalDateTime.of(2019, 11, 22, 20, 15, 07);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		System.out.println(localDate.format(fmt));
		
		// Date
		ZoneId zoneId = ZoneId.of(strTimeZone);
		Instant instant = localDate.atZone(zoneId).toInstant(); 
		Date date = Date.from(instant);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone(strTimeZone));
		System.out.println(sdf.format(date));
	}
}
