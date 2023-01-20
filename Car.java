package inheritaance;

public class Car extends Vehicle {
	private int enginecapacity,airBags;
	private String carType;
	
	public Car() {
		
	}
	public Car(String brand,String model,String registration,int ec,int ab,String ct) {
		super(brand,model,registration);
		enginecapacity=ec;
		airBags=ab;
		carType=ct;
	}
	public int getEngineCapacity() {
		return enginecapacity;
	}
	public void setEngineCapacity(int ec) {
		enginecapacity=ec;
	}
	public int getairBags() {
		return airBags;
	}
	public void setAirBags(int ab) {
		airBags=ab;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String ct) {
		carType=ct;
	}
	public String followSafety() {
		return "SeatBelt ";
	}
	public String drive() {
		return "Speed should be in limits ";
	}
	public String toString() {
		return super.toString()+"\nEngine Capacity : "+enginecapacity+" cc"+"\nNo. of Airbags : "+airBags+"\nCar type : "+carType;
	}
	
}
