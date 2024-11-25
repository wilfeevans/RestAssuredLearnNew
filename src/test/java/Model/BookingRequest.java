package Model;

import java.io.IOException;

import Base.Base;
import GetSetter.Booking;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BookingRequest extends Base
{
	public Response response;
	
	public void newBooking(Booking booking) throws IOException
	{
		
		RestAssured.baseURI=setUp().getProperty("BaseURI");
		RestAssured.basePath=setUp().getProperty("BasePath");
		
		response=RestAssured
		.given()
		.contentType(ContentType.JSON)
		.log()
		.all()
		.body(booking)
		.post();
		
		response.then().log().all();
		response.getStatusCode();
		
		
		
		
		
	}
	

}
