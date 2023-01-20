package inheritaance;
public class Class11 {
	private int[] theoMarks;  
    private int[] practicalMarks;  
    private int english;
    private int hindi;

    public Class11(int[] theoMarks, int[] practicalMarks, int english, int hindi) {
        this.theoMarks = theoMarks;
        this.practicalMarks = practicalMarks;
        this.english = english;
        this.hindi = hindi;
    }

    public double findPercentage() {
        int theoTotal = 0;
        for (int mark : theoMarks) {
            theoTotal += mark;
        }
        double theoPercentage = (double) (theoTotal / theoMarks.length) *0.6;
        int practicalTotal = 0;
        for (int mark : practicalMarks) {
            practicalTotal += mark;
        }
        double practicalPercentage = (double) (practicalTotal / practicalMarks.length)*0.4;

        return (theoPercentage + practicalPercentage + english + hindi)/3;
    }
}
