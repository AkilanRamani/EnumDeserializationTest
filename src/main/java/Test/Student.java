package Test;

import com.fasterxml.jackson.annotation.JsonView;

public class Student {
	
	public String stdId;  
	  
    // instance variable with @JsonView  
   @JsonView(Views.Internal.class)  
    public String stdName;  // this instance will be part of the class as well.
  
    // default constructor  
    Student(){  
        this.stdId = null;  
        this.stdName = null;  
    }  
  
    // parameterized constructor  
    Student(String stdId, String stdName){  
        this.stdId = stdId;  
        this.stdName = stdName;  
    }  
}  

//create class for View  
class Views {  
// create class public  
    public static class Public {  
    	 }  
    public static class Internal extends Public {  


}
}