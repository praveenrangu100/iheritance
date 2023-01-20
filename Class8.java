package inheritaance;

public class Class8 {
	private int[] marks; 

    public Class8(int[] marks) {
        this.marks = marks;
    }
    public double findPercentage() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) (totalMarks / marks.length );
}
}