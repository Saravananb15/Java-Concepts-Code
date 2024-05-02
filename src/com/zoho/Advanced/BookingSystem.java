package com.zoho.Advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingSystem {
	static List<Flight> flight = new ArrayList<>();
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			flight.add(new Flight(i,50,5000));
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Book 2.cancel ticket 3.print Status");
			int operation = sc.nextInt();
			
			
			switch(operation) {
				
			case 1:{
				System.out.println("Enter the fligh number :");
				int flightIdToBook = sc.nextInt()-1;
				if(flightIdToBook > flight.size()) {
					System.out.println("Invalid flight number entered");
					break;
				}
				System.out.println("Enter number of tickets ");
				int ticketCount = sc.nextInt();
				if(ticketCount > flight.get(flightIdToBook).tickets) {
					System.out.println("Sorry!! selected numbers of tickets not available, Available tickets : "+flight.get(flightIdToBook).tickets);
					break;
				}
				int passengerId = flight.get(flightIdToBook).passenger.size()+1;
				int price =  flight.get(flightIdToBook).price*ticketCount;
				PassengerDetails passenger = new PassengerDetails(passengerId, ticketCount, price);
				flight.get(flightIdToBook).passenger.add(passenger);;
				flight.get(flightIdToBook).price += ticketCount*200;
				flight.get(flightIdToBook).tickets -= ticketCount;
				System.out.println("Booking Successful! Thanks for booking...");
				System.out.println("Status of Booking : " + "Flight Id : "+ flight.get(flightIdToBook).flightId + " Tickets available "+flight.get(flightIdToBook).tickets+ " Current price of ticket "+ flight.get(flightIdToBook).price);
				break;
			}
			
			case 2:{
				System.out.println("Enter flight Id and passenger Id :");
				int flightId = sc.nextInt()-1;
				int passengerId = sc.nextInt()-1;
				if(flightId > flight.size() ) {
					System.out.println("Please enter a valid flight Id");
					break;
				}
				if(passengerId > flight.get(flightId).passenger.size()) {
					System.out.println("Please enter a valid Passenger Id");
					break;
				}
				int ticketCount = flight.get(flightId).passenger.get(passengerId).noOfTickets;
				System.out.println(ticketCount);
				flight.get(flightId).tickets += ticketCount;
				flight.get(flightId).price -= ticketCount*200;
				System.out.println("Status of cancellation : " + "Flight Id : "+ flight.get(flightId).flightId + " Tickets available "+flight.get(flightId).tickets+ " Current price of ticket "+ flight.get(flightId).price);
				flight.get(flightId).passenger.remove(passengerId);
				break;
			}
			
			case 3:{
				printStatus();
			}
			}
		}
		
	}
	
	public static void printStatus() {
		System.out.println("Here is the status of flights :");
		for(Flight fli : flight) {
			System.out.println("Flight Id : "+ fli.flightId + " Tickets available "+fli.tickets+ " Current price of ticket "+ fli.price);
		}
	}
}
