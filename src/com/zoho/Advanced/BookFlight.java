package com.zoho.Advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookFlight {
	public static void main(String[] args) {
		List<FlightBooking> flights = new ArrayList<>();
		for(int i=0;i<5;i++) {
			flights.add(new FlightBooking());
		}
		int passengerId =1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1 to Book, "+" "+"Enter 2 to cancel, "+" "+"Enter 3 to print status");
			int operation = sc.nextInt();
			
			
			switch(operation){
				case 1: {
					System.out.println("Enter flight Id : ");
					int fid = sc.nextInt();
					
					if(fid > flights.size()) {
						System.out.println("Please enter a valid flight id");
						break;
					}
					FlightBooking flight = null;
					for(FlightBooking f : flights) {
						if(f.flightId == fid) {
							flight = f;
							f.flightSummary();
							break;
						}
					}
					System.out.println("Number of tickets :");
					int noOfTicker = sc.nextInt();
					if(noOfTicker > flight.tickets) {
						System.out.println("Selected No of tickets Not available for this flight");
						break;
					}
					book(flight,noOfTicker,passengerId);
					passengerId+=1;
					break;
				}
					
			}
		}
	}
	
	public static void book(FlightBooking flight ,int tickets, int passengerId) {
		String passengerDetails = "";
		passengerDetails = "Passenger Id "+passengerId +" Number of tickets booked "+tickets+" Total cost "+ flight.price*tickets;
		flight.addPassengerDetails(passengerDetails, tickets, passengerId);
		flight.flightSummary();
		flight.printDetails();
	}
}
