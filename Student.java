package inheritaance;
import java.util.Scanner;
public class Student {
	private int Id;
	private  String Name;
	private String Address;
	
	public Student(){	
	}
	public Student(int id,String name,String add) {
		Id=id;
		Name=name;
		Address=add;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id=id;
	}
	public String getName() {
		return  Name;
	}
	public void setName(String name) {
		Name=name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String add) {
		Address=add;
	}
	public void readDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		 Id = sc.nextInt();
		 sc.nextLine();
		System.out.println("Enter Student Name :");
		Name = sc.nextLine();
		System.out.println("Enter Student Address :");
		Address = sc.nextLine();
		sc.close();
	}
	public void displayDetails() {
		System.out.println("Student id : "+Id+"\nStudent Name: "+Name +"\nStudent Address : "+Address);
	}
}