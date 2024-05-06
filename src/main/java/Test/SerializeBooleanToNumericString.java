package Test;

import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeBooleanToNumericString {

	public static void main(String[] args) throws JsonProcessingException {
		String id, name, status;  
        Boolean passed = false, fail = false;  
          
        // create an instance of Scanner class  
        Scanner sc = new Scanner(System.in);  
          
        System.out.println("Enter Student Id: ");  
        id = sc.nextLine();  
          
        System.out.println("Enter Student Name: ");  
        name = sc.nextLine();  
          
        System.out.println("Is "+name+ "pass in exams(Yes/No)?: ");  
        status = sc.nextLine();  
          
        if(status.equals("Yes")) {  
            passed = true;  
        }  
          
        if(status.equals("No")) {  
            fail = true;  
        }  
          
        // close Scanner class object  
        sc.close();  
          
        // create Student object  
        Student1 std = new Student1(id, name, passed, fail);  
  
        // create an instance of ObjectMapper class  
            ObjectMapper mapper = new ObjectMapper();  
          
            //serialize Student object to JSON  
            String jsonString = mapper.writeValueAsString(std);  
          
            System.out.println("Java object after serializing:"+jsonString);  
    }  
	}


