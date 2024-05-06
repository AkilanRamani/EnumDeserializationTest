package Test;

import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONViewExample1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws JsonProcessingException {
		  String id, name;  
	        // create an instance of Scanner class  
	        Scanner sc = new Scanner(System.in);  
	          
	        System.out.println("Enter Student Id: ");  
	        id = sc.nextLine();  
	          
	        System.out.println("Enter Student Name: ");  
	        name = sc.nextLine();  
	          
	        // close Scanner class object  
	        sc.close();  
	          
	        // create Student object  
	        Student std = new Student(id, name);  
	  
	        // create an instance of ObjectMapper class  
	        ObjectMapper mapper = new ObjectMapper();  
	          
	        // disable DEFAULT_VIEW_INCLUSION mapper feature  
	       mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION)  ;
	       //(
	  
	        String result = mapper  
	                .writerWithView(Views.Public.class)  
	                .writeValueAsString(std);  
	          
	        System.out.println("Java object after serializing:"+result);  
	          
	    }  

	}


