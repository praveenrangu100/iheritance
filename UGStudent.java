package inheritaance;

public class UGStudent extends Student1{
	private String college,branch;

	public UGStudent() {
		
	}
	public UGStudent(int id,String name,String address,String branch,String college) {
		super(id,name,address);//1,uma,hyd
		this.college = college;
		this.branch = branch;
	}
	
	public String getCollege() {
		 return college;
	 }
	public void setCollege(String college) {
		this.college = college;
	}
	public String getBranch() {
		 return branch;
	 }
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String toString() {
		return super.toString()+"\nBranch " + branch + "\nCollege " + college;
	}

}
