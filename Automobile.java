package inheritaance;
public class Automobile {
	public static void main (String[] args) {
		Bike b1 =new Bike("Hero","Activa","TS 08 AB 2022",100,"Scooty");
		System.out.println(b1);
		System.out.println(b1.drive());
		System.out.println(b1.followSafety());
		System.out.println("__________________________________________");
		Car c1 = new Car("Tata","Harrier","TS 08 AB 7777",1997,5,"SUV");
		System.out.println(c1);
		System.out.println(c1.drive());
		System.out.println(c1.followSafety());
	}
}
