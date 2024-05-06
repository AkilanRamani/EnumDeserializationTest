package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		//Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss"); 
	    
	    TimeZone time = TimeZone.getTimeZone("UTC");
	    formatter.setTimeZone(time);
        ObjectMapper mapper = new ObjectMapper();  
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); 
        mapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));  

	    String date1 = "24-02-2024 01:16:33";
	    Date d = formatter.parse(date1);
	    System.out.println(d);
		
	}

}
