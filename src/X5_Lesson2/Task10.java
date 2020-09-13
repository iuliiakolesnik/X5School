import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[]{15, 10, 0, -6, -5, 3, 0, 34, 0, 32, 56, 0, 24, -52};
        int count_of_null = 0, length_array = array.length - 1;

        for (int i = length_array; i >= 0; i--) {
            if (array[i] == 0) {
                array[i] = array[length_array - count_of_null];
                array[length_array - count_of_null] = 0;
                count_of_null++;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
