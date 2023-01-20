package inheritaance;

public class StaticExample {
		//static -variables,methods,block
		int a = 1;
		static int b = 1;	
		public  void display() {
		System.out.println("value of a is " + a++);
		System.out.println("value of b is " + b++);
		
		System.out.println("==========================");
		System.out.println("value of a is " + a++);
		System.out.println("value of b is " + b++);
		}
		public static void main(String[] args) {
			StaticExample o1 = new StaticExample();
			o1.display();
			
			System.out.println("-------------------------------------");
			
			StaticExample o2 = new StaticExample();
			o2.display();
			System.out.println("-------------------------------------");
			
			StaticExample o3 = new StaticExample();
			o3.display();	
		}
	}

