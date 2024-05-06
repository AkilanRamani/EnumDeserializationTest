package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializeJSONArrayToJavaCollectionExample {

	public static void main(String[] args) throws JsonProcessingException {
		 int n;  
         
	        // create an instance of ObjectMapper class  
	        ObjectMapper mapper = new ObjectMapper();  
	          
	        // create Scanner class object  
	        Scanner sc = new Scanner(System.in);  
	          
	        // create an empty list of Student  
	        List<StudentTest> students = new ArrayList<StudentTest>();  
	          
	        // take input from user and get student records from user  
	        System.out.println("How many student records you have?");  
	        n = Integer.valueOf(sc.nextLine());  
	          
	        // use for loop to fill Student ArrayList  
	        for(int i = 0; i < n; i++) {  
	              
	            String id, name, status;  
	            Boolean passed = false, fail = false;  
	              
	            System.out.println("Enter id of "+(i+1)+" Student");  
	            id = sc.nextLine();  
	            System.out.println("Enter name of "+(i+1)+" Student");  
	            name = sc.nextLine();  
	              
	            System.out.println("Is "+name+ " pass in exams(Yes/No)?: ");  
	            status = sc.nextLine();  
	              
	            if(status.equals("Yes")) {  
	                passed = true;  
	            }  
	              
	            if(status.equals("No")) {  
	                fail = false;  
	            }  
	              
	            students.add(new StudentTest(id, name, passed, fail));  
	            System.out.println(students);
	              
	        }  
	          
	        // close Scanner class object  
	        sc.close();  
	          
	        // serialize students into JSONArray  
	        String jsonArray = mapper.writeValueAsString(students); 
	        System.out.println(jsonArray);
     
	          
	        // deserialize JSON array into Java Array  
	        @SuppressWarnings("unchecked")  
	        List<StudentTest> data = mapper.readValue(jsonArray, List.class);  
	        System.out.println(data);// size is 1 
	          
	        // use for each to iterate Student array  
	        for(int i = 0; i < data.size(); i++) {  
	            System.out.println("JSONArray after deserialize "+ data.get(i));  
	        }  
	          
	    }  

	}


