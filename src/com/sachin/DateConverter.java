package com.sachin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DateConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a date to find 7 days forward or backward");

		String userInput = sc.nextLine();

		System.out.println("Please enter number of days to go back or front");

		int userInput1 = sc.nextInt();
		
		

		System.out.println("Please enter if you would like to go forward or back by pressing + or -");
		Scanner sc1 = new Scanner(System.in);
		String userInput2 = sc1.nextLine();

		

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

		LocalDate localDate = LocalDate.parse(userInput, formatter);

		LocalDate convertedDate = null;

		if (userInput2.equals("+")) {

			convertedDate = convertForwardFormat(localDate, userInput1);

		} else {

			convertedDate = convertBackwardFormat(localDate, userInput1);

		}

		String output = String.format("Dates conversion is from %s to %s", localDate, convertedDate);
		System.out.println(output);

	}

	private static LocalDate convertBackwardFormat(LocalDate nowDate, int numberofDays) {
		// TODO Auto-generated method stub

		return nowDate.minusDays(numberofDays);

	}

	private static LocalDate convertForwardFormat(LocalDate nowDate, int numberofDays) {
		// TODO Auto-generated method stub

		return nowDate.plusDays(numberofDays);

	}
}
