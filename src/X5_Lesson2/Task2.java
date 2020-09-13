import java.util.*;

public class Task2 {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int s = reader.nextInt();
        int sum = 0;

        for (int i = 2; i >= 0; i--) {
            int delitel = (int) Math.pow(10, i);
            sum = sum + s / delitel;
            s = s % delitel;
        }

        System.out.println("Sum of number is " + sum);
    }


}
