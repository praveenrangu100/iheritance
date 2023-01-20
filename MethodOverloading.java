package inheritaance;

public class MethodOverloading {
	 public void getSum(int a ,int b) {
		 System.out.println("Addition of two numbers is " + (a+b));
	 }
	 public void getSum(float a ,int b) {
		 System.out.println("Addition of two numbers is " + (a+b));
	 }
	 
	 
	 public static void main(String[] args) {
		MethodOverloading o1 = new MethodOverloading();
		o1.getSum(12.4f,2);
}
}
