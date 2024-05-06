package Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONViewExample3 {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String jsonString = "{\"stdId\":\"121\", \"stdName\":\"Nicholas\"}";  
		  
        // create an instance of ObjectMapper class  
            ObjectMapper mapper = new ObjectMapper();  
          
            // deserialize JSON string in Java object by using Jackson View  
            Student std = mapper  
                    .readerWithView(Views.Public.class)  
                    .forType(Student.class)  
                    .readValue(jsonString);  
                        
            // print student Id and Name  
            System.out.println("Student Id: "+std.stdId);  
            System.out.println("Student Name: "+std.stdName);  
    }  
	}


