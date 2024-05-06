package Test;

public class StudentTest {
	
	  @Override
	public String toString() {
		return "StudentTest [stdId=" + stdId + ", stdName=" + stdName + ", passed=" + passed + ", fail=" + fail + "]";
	}

	private String stdId;  
	    private String stdName;  
	    private Boolean passed;  
	    private Boolean fail;  
	      
	    public StudentTest() {  
	        this.stdId = null;  
	        this.stdName = null;  
	        this.passed = null;  
	        this.fail = null;  
	    }  
	  
	    public StudentTest(String stdId, String stdName, Boolean passed, Boolean fail) {  
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
