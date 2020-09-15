package X5_Lesson3.Task3;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        Aspirant aspirant1 = new Aspirant("Tom", "Reddle", "slizerine", 5, true);
        Aspirant aspirant2 = new Aspirant("Germiona", "Greindger", "griffindor", 5, true);
        Student student1 = new Student("Ron", "Yizli", "griffindor", 4.5);
        Student student2 = new Aspirant("Garry", "Potter", "griffindor", 4, true);
        Student student3 = new Student("Drako", "Malfoi", "griffindor", 5);

        students.add(aspirant1);
        students.add(student1);
        students.add(student2);
        students.add(aspirant2);
        students.add(student3);

        for (Student i : students) {
            System.out.println(i.getScholarship());
        }

    }
}
