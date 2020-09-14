package X5_Lesson2.Task1;
import java.util.*;


public class Task1 {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String s = reader.nextLine();

        System.out.println("Last number is " + s.substring(s.length() - 1));
    }
}
