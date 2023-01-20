package inheritaance;

public class School {

	 public static void main(String[] args) {
	        

	        Class8 class8_1 = new Class8(new int[]{80, 70, 60, 50, 40});
	        Class8 class8_2 = new Class8(new int[]{90, 80, 70, 60, 50});
	        Class8 class8_3 = new Class8(new int[]{100, 90, 80, 70, 60});
	        Student2 c8s1 = new Student2("Praveen");
	        Student2 c8s2 = new Student2("Varun");
	        Student2 c8s3 = new Student2("Kalyan");
	        System.out.println("Percentage in class 8");
	        System.out.println(c8s1.getId()+" "+c8s1.getName() + "'s percentage: " + class8_1.findPercentage() + "%");
	        System.out.println(c8s2.getId()+" "+c8s2.getName() + "'s percentage: " + class8_2.findPercentage() + "%");
	        System.out.println(c8s3.getId()+" "+c8s3.getName() + "'s percentage: " + class8_3.findPercentage() + "%");
	        System.out.println("-----------------------------------------------------");
	        Class11 class11_1 = new Class11(new int[]{80, 70, 60}, new int[]{50, 40, 30}, 60, 70);
	        Class11 class11_2 = new Class11(new int[]{90, 80, 70}, new int[]{60, 50, 40}, 70, 80);
	        Class11 class11_3 = new Class11(new int[]{100, 90, 80}, new int[]{70, 60, 50}, 80, 90);
	        Student2 c11s1 = new Student2("Suri Babu");
	        Student2 c11s2 = new Student2("Ramana");
	        Student2 c11s3 = new Student2("Venky");
	        System.out.println("Percentage in class 11");
	        System.out.println(c11s1.getId()+" "+c11s1.getName() + "'s percentage: " + class11_1.findPercentage() + "%");
	        System.out.println(c11s2.getId()+" "+c11s2.getName() + "'s percentage: " + class11_2.findPercentage() + "%");
	        System.out.println(c11s3.getId()+" "+c11s3.getName() + "'s percentage: " + class11_3.findPercentage() + "%");

	}

}
