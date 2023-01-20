package inheritaance;

public class Vehicle {
	private String brand,model,registration;
	public Vehicle() {
		
	}
	public Vehicle(String brand,String model,String registration ) {
		this.brand=brand;
		this.model=model;
		this.registration=registration;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration=registration;
	}
	public String followSafety() {
		return "Follow safety guidelines while driving";
	}
	public String drive() {
		return "Driving the vechile";
	}
	public String toString(){
		return "Brand :"+brand+"\nModel :"+model+"\nRegistration :"+registration;
	}
}
