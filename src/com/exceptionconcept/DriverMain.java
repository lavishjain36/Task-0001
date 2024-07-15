package com.exceptionconcept;

public class DriverMain {

	public static void main(String[] args)  {

		TicketBooking book1=new TicketBooking();
		
//		try {
//			book1.bookTicket(1,10);
//		} catch (InvalidTicketException e) {
//			System.out.println(e.getMessage());
//		} catch (InsuffcientSeatsException e) {
//			System.out.println(e.getMessage());
//
//		}//valid
		
		//invalid ticket number
//		try {
//			book1.bookTicket(0,5);
//		} catch (InvalidTicketException | InsuffcientSeatsException e) {
//			System.out.println(e.getMessage());
//		}//invalid
		
		
		try {
			book1.bookTicket(3, 5);
		} catch (InvalidTicketException | InsuffcientSeatsException e) {
			System.out.println(e.getMessage());

		}

	}

}
