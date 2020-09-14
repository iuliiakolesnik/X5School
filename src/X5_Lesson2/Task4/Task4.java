package X5_Lesson2.Task4;

import java.util.*;


public class Task4 {

    public static void main(String[] agrs) {
        Scanner reader = new Scanner(System.in);

        int number = reader.nextInt();

        if (number == 0) {
            number = 10;
        } else {
            if (number > 0) {
                number = number + 2;
            } else {
                number = number - 2;
            }
        }

        System.out.println("Number is: " + number);
    }
}
