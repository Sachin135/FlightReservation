package com.sachin;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flight nycToLas = new Flight(50, 60);

		System.out.println(nycToLas.getSeats());

		System.out.println(nycToLas.getFlightnumber());

		for (Seat seat : nycToLas.getSeatArray()) {

			System.out.print(seat.toString());

		}


			
			System.out.println();
			
		
		nycToLas.reserve(12);
		nycToLas.reserve(1);
		nycToLas.reserve(4);
		
		for (Seat seat : nycToLas.getSeatArray()) {

			System.out.print(seat.toString());

		}

	}

}
