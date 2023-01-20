package inheritaance;

public class StaticMethod {
		public static void display() {
			System.out.println("Static Method");
		}
		public static void displayData() {
			System.out.println("Non-static Method");
		}
		static {
			System.out.println("static block");
		}
		public static void main(String[] args) {
			display();
			
			StaticMethod o1 = new StaticMethod();
			o1.displayData();
		}
	}
