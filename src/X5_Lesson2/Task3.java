import java.util.*;


public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = reader.nextInt();

        if (number > 0) {
            number++;
        }

        System.out.println("Number is: " + number);
    }
}
