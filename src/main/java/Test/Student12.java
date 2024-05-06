package Test;

public class Student12 {
	
	 public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Boolean getPassed() {
		return passed;
	}

	public void setPassed(Boolean passed) {
		this.passed = passed;
	}

	@Override
	public String toString() {
		return "Student12 [stdId=" + stdId + ", stdName=" + stdName + ", passed=" + passed + ", fail=" + fail + "]";
	}

	public Boolean getFail() {
		return fail;
	}

	public void setFail(Boolean fail) {
		this.fail = fail;
	}

	private String stdId;  
	    private String stdName;  
	    private Boolean passed;  
	    private Boolean fail;  
	      
	    public Student12() {  
	        this.stdId = null;  
	        this.stdName = null;  
	        this.passed = null;  
	        this.fail = null;  
	    }  
	  
	    public Student12(String stdId, String stdName, Boolean passed, Boolean fail) {  
	        this.stdId = stdId;  
	        this.stdName = stdName;  
	        this.passed = passed;  
	        this.fail = fail;  
	    }  
	  
	   

}
