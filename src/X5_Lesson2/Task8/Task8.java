package X5_Lesson2.Task8;

import java.util.*;

public class Task8 {

    public static void main(String[] agrs) {
        int[] array = new int[]{1, -10, 5, 6, 45, 23, -45, 34, 0, 32, 56, -1, 2, -2};

        int max = Integer.MIN_VALUE;
        int sum_plus = 0, plus_count = 0, count_odd_minus = 0, count_minus = 0;
        double sum_minus = 0;

        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i > 0) {
                sum_plus = sum_plus + i;
                plus_count++;
            }
            if (i < 0) {
                sum_minus = sum_minus + (double) i;
                count_minus++;
                if (i % 2 == 0) {
                    count_odd_minus++;
                }
            }
        }

        System.out.println("Max is: " + max);
        System.out.println("Sum of plus: " + sum_plus);
        System.out.println("Count of odd minus: " + count_odd_minus);
        System.out.println("Count of plus: " + plus_count);
        System.out.println("Avg of minus: " + sum_minus / (double) count_minus);
    }
}
