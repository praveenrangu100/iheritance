package inheritaance;

public class Bike extends Vehicle{
	private int engineCapacity;
	private String varientType;
	
	public Bike() {
		
	}
	public Bike(String brand,String model,String registration,int ec,String vt) {
		super(brand,model,registration);
		engineCapacity=ec;
		varientType=vt;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void getEngineCapacity(int ec) {
		engineCapacity=ec;
	}
	public String getVarientType() {
		return varientType;
	}
	public void setVarientType(String vt) {
		varientType=vt;
	}
	public String followSafety() {
		return "Wear helmet ";
	}
	public String drive() {
		return "while driving pillion rider should  wear a helmet ";
	}
	public String toString() {
		return super.toString()+"\nEngine Capacity : "+engineCapacity+" cc"+"\nVarient Type : "+varientType;
	}
}
