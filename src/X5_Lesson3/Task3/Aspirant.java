package X5_Lesson3.Task3;

public class Aspirant extends Student {
    private boolean scienceWork;

    public int getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, boolean scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }
}