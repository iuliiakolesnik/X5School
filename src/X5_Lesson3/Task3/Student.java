package X5_Lesson3.Task3;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public int getScholarship() {
        if (this.averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }

    public double getAverageMark(){
        return this.averageMark;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
}