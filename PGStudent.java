package inheritaance;

public class PGStudent extends UGStudent{
	private String university,specialisation;
	public PGStudent() {
	}
	public PGStudent(int id,String name,String address,String branch,String college,String u,String s) {
		super(id,name,address,branch,college);
		university=u;
		specialisation=s;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String u) {
		university=u;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String s) {
		specialisation=s;
	}
	public String toString() {
		return super.toString()+"\nUniversity "+university+"\nSpecialisation "+specialisation;
	}
}
