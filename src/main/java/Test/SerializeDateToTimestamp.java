package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class SerializeDateToTimestamp {

	public static void main(String[] args) throws ParseException, JsonProcessingException {
		/*  String dateStr;  
	        // create an instance of Scanner class object  
	        Scanner sc = new Scanner(System.in);  
	        System.out.println("Enter Date in dd-MM-yyyy hh:mm:ss format:");  
	        dateStr = sc.nextLine();  
	        // create an instance of SimpleDateFormat class  
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
	        // set time zone by using setTimeZone() method of SimpleDateFormat class  
	        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));  
	        // parse dateStr by using parse() method of SimpleDateFormat  
	        Date date = sdf.parse(dateStr);  
	        // create an instance of Event by using data  
	        Event evt = new Event("New Date", date);  
	        // create an instance of ObjectMapper class  
	        ObjectMapper mapper = new ObjectMapper();  
	        // serialize evt by using writeValueAsString() method  
	            String jsonString = mapper.writeValueAsString(evt);  
	            //print jsonString  
	            System.out.println(jsonString);  
	            // close Scanner class object  
	            sc.close(); */
		String dateStr;  
        // create an instance of Scanner class object  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Date in dd-MM-yyyy hh:mm:ss format:");  
        dateStr = sc.nextLine();  
          
        // create an instance of SimpleDateFormat class  
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
        // set time zone by using setTimeZone() method of SimpleDateFormat class  
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));  
          
        // parse dateStr by using parse() method of SimpleDateFormat  
        Date date = sdf.parse(dateStr);  
          
        // create an instance of Event by using data  
        Event evt = new Event("New Date", date);  
          
        // create an instance of ObjectMapper class  
        ObjectMapper mapper = new ObjectMapper();  
          
        //disable WRITE_DATES_AS_TIMESTAMPS feature  
      //  mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);  
          
        // set StdDateFormat by using setDateFormat() method  
        mapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));  
          
        // serialize evt by using writeValueAsString() method  
        String jsonString = mapper.writeValueAsString(evt);  
          
        //print jsonString  
        System.out.println(jsonString);  
          
        // close Scanner class object  
        sc.close();  
          
    }  

	}

