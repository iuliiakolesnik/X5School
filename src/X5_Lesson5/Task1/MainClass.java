package X5_Lesson5.Task1;

public class MainClass {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double x = calculator.initiate();
        double y = calculator.initiate();
        char operation = calculator.initiateOperation();

        System.out.println("Результат операции: " + calculator.calculation(x, y, operation));
    }
}

