package com.sachin;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class InstantConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instant instant = Instant.now();
		System.out.println(instant);
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		System.out.println(formatter1.format(LocalDateTime.now()));
		
		
		ZoneId australia = ZoneId.of("Australia/Sydney");
		String str = "2015-01-05 17:00";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
		ZonedDateTime dateAndTimeInSydney = ZonedDateTime.of(LocalDateTime.now(), australia );

		System.out.println("Current date and time in a particular timezone : " + dateAndTimeInSydney);

		ZonedDateTime utcDate = dateAndTimeInSydney.withZoneSameInstant(ZoneOffset.UTC);

		System.out.println("Current date and time in UTC : " + utcDate);

	}
	
}
