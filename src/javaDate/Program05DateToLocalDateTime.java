package javaDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Program05DateToLocalDateTime {

	public static void main(String[] args) throws ParseException {
		
		// Time zone string
		String strTimeZone = "GMT-3";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone(strTimeZone));
		
		// Date
		Date date = sdf.parse("22/11/2019 20:15:07");	// Parse operation is done considering current time zone
		System.out.println(sdf.format(date));
		
		// Local Date
		LocalDateTime localDate = LocalDateTime.ofInstant(date.toInstant(), ZoneId.of(strTimeZone));
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		System.out.println(localDate.format(fmt));
		
	}

}
