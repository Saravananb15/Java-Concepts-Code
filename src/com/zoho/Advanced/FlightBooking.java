package com.zoho.Advanced;

import java.util.ArrayList;

public class FlightBooking {
	public static void main(String[] args) {

	}

	int id = 0;
	int flightId;
	int tickets;
	int price;
	ArrayList<String> passengerDetails;
	ArrayList<Integer> passengerIDs;
	ArrayList<Integer> bookedTickercount;
	ArrayList<Integer> passengerCost;

	FlightBooking() {
		id = id + 1;
		flightId = id;
		tickets = 50;
		price = 5000;
		passengerDetails = new ArrayList<String>();
		passengerIDs = new ArrayList<Integer>();
		bookedTickercount = new ArrayList<Integer>();
		passengerCost = new ArrayList<Integer>();
	}

	public void addPassengerDetails(String passengerDetail, int numberOfTickets, int passengerID) {
		passengerDetails.add(passengerDetail);
		passengerIDs.add(passengerID);
		passengerCost.add(price * numberOfTickets);

		// updating price using logic in the problem statement
		price += 200 * numberOfTickets;

		// updating available number of tickets
		tickets -= numberOfTickets;
		bookedTickercount.add(numberOfTickets);
		System.out.println("Booked Successfully!");

	}

	public void flightSummary() {
		System.out.println(
				"Flight Id : " + flightId + "-- Remaining Tickets :" + tickets + "Current Ticker price : " + price);
	}

	public void printDetails() {
		System.out.println("Flight ID " + flightId + "->");
		for (String detail : passengerDetails)
			System.out.println(detail);
	}
}
