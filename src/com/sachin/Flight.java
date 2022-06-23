package com.sachin;

import java.io.ObjectInputStream.GetField;

public class Flight {

	private int passenger = 0;
	private int seats = 125;
	private int flightNumber;

	private Seat[] seatArray = new Seat[125];

	private Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(int seats, int flightnumber) {
		super();
		this.seats = seats;
		this.flightNumber = flightnumber;

		for (int i = 0; i < seatArray.length; i++) {

			Seat seat = new Seat(i + 1, true);

			this.seatArray[i] = seat;

		}

	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getFlightnumber() {
		return this.flightNumber;
	}

	public void setFlightnumber(int flightnumber) {
		this.flightNumber = flightnumber;
	}

	public Seat[] getSeatArray() {
		return seatArray;
	}

	public void setSeatArray(Seat[] seatArray) {
		this.seatArray = seatArray;
	}
	
	
	public boolean reserve (int seatNumber) {
	
		for (int i = 0; i < seatArray.length; i++) {
			
			if (seatNumber == i+1) {
				
			Seat seat= seatArray[i];
			
			seat.setSeatAvailable(false);
			
			seatArray [i]= seat;
				
			}
			
			
		}
		
		return true;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static int searchingArray(String[] arr, String searchedText) {
		return 0;
		// TODO Auto-generated method stub

	}

}
