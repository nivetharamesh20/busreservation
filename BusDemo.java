package BusResr;
import java.sql.SQLException;
import java.util.*;
public class BusDemo {

	public static void main(String[] args) throws Exception{
	 
	BusDAO busdao = new BusDAO();

	busdao.displayBusInfo();
		
	int userOpt=1;
	Scanner scanner = new Scanner (System.in);
	
	
	 while(userOpt==1) {
	 System.out.println("Enter 1 to book and 2 to exit");
	 userOpt=scanner.nextInt();
	 if(userOpt==1) {
		 Booking booking = new Booking();
		 if(booking.isAvailable()) {
			 BookingDAO BookingDAO = new BookingDAO();
			 BookingDAO.addBooking(booking);
			 System.out.println("Your booking is confirmed");
		 }
		 else {
			 System.out.println("Sorry.Bus is full. Try another bus or date.");
		 }
	    }
	 }
	 
	 
 }
	}

	

