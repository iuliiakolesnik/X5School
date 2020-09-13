import java.util.*;

public class Task6 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = reader.nextInt();

        if (number == 0) {
            System.out.println("Нулевое число");
        } else {
            System.out.println(sign(number) + odd(number) + "число");
        }
    }

    static String sign(int number) {
        if (number > 0) {
            return "Положительное ";
        } else {
            return "Отрицательное ";
        }
    }

    static String odd(int number) {
        if (number % 2 == 0) {
            return "четное ";
        } else {
            return "нечетное ";
        }
    }
}
