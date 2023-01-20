package inheritaance;

public class Student2 {
	 private static int nextId = 1;  
	    private int id;  
	    private String name;
	    public Student2() {
	    }
	    public Student2(String name) {
	        this.id = nextId;  
	        this.name = name;
	        nextId++;
}
	    public int getId() {
	    	return id;
	    }
	    public void setId(int id) {
	    	this.id=id;
	    }
	    public String getName() {
	    	return name;
	    }
	    public void setName(String name) {
	    	this.name=name;
	    }
	    
}