package com.exceptionconcept;

public class TicketBooking {
	//available
	private int seatsavailable=30;
	
	//functionality->to book ticket
	public void bookTicket(int ticketnumber,int seats) throws InvalidTicketException, InsuffcientSeatsException {
		//check ticet greater<0
		if(ticketnumber<=0) {
			throw new InvalidTicketException("Ticket number must be greater than 0");
			
		}
		
		//check seats->45>30
		if(seats>seatsavailable) {
			throw new InsuffcientSeatsException("Not enough seats available");
		}
		seatsavailable-= seats;
		System.out.println("Ticket booked successfully. Seat remaining " +seatsavailable);
		
	}
	
	
}
