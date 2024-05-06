package Test;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Student1 {
	private String stdId;  
    private String stdName;  
   
    @JsonSerialize(using = NumericStringSerializer.class)  
    private Boolean passed;  
   
    @JsonSerialize(using = NumericStringSerializer.class)  
    private Boolean fail;  
  
    public Student1(String stdId, String stdName, Boolean passed, Boolean fail) {  
        this.stdId = stdId;  
        this.stdName = stdName;  
        this.passed = passed;  
        this.fail = fail;  
    }  
   
    public String getStdId() {  
        return stdId;  
    }  
   
    public String getStdName() {  
        return stdName;  
    }  
   
    public Boolean getPassed() {  
        return passed;  
    }  
   
    public Boolean getFail() {  
        return fail;  
    }   
}
