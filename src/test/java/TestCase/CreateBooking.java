package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import GetSetter.Booking;
import GetSetter.BookingDates;
import Model.BookingRequest;
import Utilities.ExcelUtil;

public class CreateBooking 
{
	@Test(dataProviderClass = ExcelUtil.class, dataProvider = "dp")
	public void createBooking(String firstname, String lastname, String totalprice, String depositpaid, String checkin, String checkout, String additionalneeds) throws IOException
	{
		
		Booking booking= new Booking();
		booking.setFirstname(firstname);
		booking.setLastname(lastname);
		booking.setTotalprice(Integer.parseInt(totalprice));
		booking.setDepositpaid(Boolean.parseBoolean(depositpaid));
		
		BookingDates bookingdates= new BookingDates();
		bookingdates.setCheckin(checkin);
		bookingdates.setCheckout(checkout);
		
		booking.setBookingdates(bookingdates);
		booking.setAdditionalneeds(additionalneeds);
		
		BookingRequest bookingrequest= new BookingRequest();
		bookingrequest.newBooking(booking);
				
		
		
		
		
	}

	
}
