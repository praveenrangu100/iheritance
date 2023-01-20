
package inheritaance;

public class Student1 {
		private int id;
		private String name,address;
		public Student1() {
		}
		public Student1(int id,String name,String address) {
			this.id = id;
			this.name = name;
			this.address = address;
		}
		 public int getId() {
			 return id;
		 }
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			 return name;
		 }
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			 return address;
		 }
		public void setAddress(String address) {
			this.address = address;
		}
		
		public void toLearn() {
			System.out.println("Studying");
		}
		public String toString() {
			return "Id " + id +"\nName " + name + "\nAddress " + address;	
		}
}

