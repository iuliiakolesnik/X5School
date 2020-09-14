package X5_Lesson2.Task5;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int number = reader.nextInt();
            if (number < min) {
                min = number;
            }
        }

        System.out.println("min is: " + min);
    }
}
