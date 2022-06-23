package com.sachin;

public class Seat {

	private int seatNumber;

	private boolean isSeatAvailable;

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seat(int seatNumber, boolean isSeatAvailable) {
		super();
		this.seatNumber = seatNumber;
		this.isSeatAvailable = isSeatAvailable;
	}

	
	
	
	
	
	public int getSeatNumber() {
		return seatNumber;
	}

	@Override
	public String toString() {
		return " [seatNumber=" + seatNumber + ", isSeatAvailable=" + isSeatAvailable + "]";
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isSeatAvailable() {
		return isSeatAvailable;
	}

	public void setSeatAvailable(boolean isSeatAvailable) {
		this.isSeatAvailable = isSeatAvailable;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
