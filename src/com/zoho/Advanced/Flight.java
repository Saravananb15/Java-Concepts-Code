package com.zoho.Advanced;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	int flightId;
	int tickets = 50;
	int price = 5000;

	public Flight(int flightId, int tickets, int price) {
		super();
		this.flightId = flightId;
		this.tickets = tickets;
		this.price = price;
	}

	public Flight(int flightId, int tickets, int price, List<PassengerDetails> passenger) {
		super();
		this.flightId = flightId;
		this.tickets = tickets;
		this.price = price;
		this.passenger = passenger;
	}

	List<PassengerDetails> passenger = new ArrayList<>();
}
