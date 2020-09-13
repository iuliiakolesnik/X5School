package X5_Lesson5.Task1;

import java.util.*;

public class Calculator {
    static Scanner reader = new Scanner(System.in);
    private LoggerFactory loggerFactory;
    private Logger logger;

    private double addition(double x, double y) {
        loggerFactory = new ConsoleLoggerFactory();
        logger  = loggerFactory.createLogger();
        logger.log("+: " + x + " " + y + " result " + (x + y));
        return x + y;
    }

    private double subtraction(double x, double y) {
        loggerFactory = new FileLoggerFactory();
        logger  = loggerFactory.createLogger();
        logger.log("-: " + x + " " + y + " result " + (x - y));
        return x - y;
    }

    private double multiplication(double x, double y) {
        loggerFactory = new DbLoggerFactory();
        logger  = loggerFactory.createLogger();
        logger.log("*: " + x + " " + y  + " result " + (x * y));
        return x * y;
    }

    private double division(double x, double y) {
        loggerFactory = new KafkaLoggerFactory();
        logger  = loggerFactory.createLogger();
        logger.log("/: " + x + " " + y  + " result " + (x / y));
        return x / y;
    }

    public double initiate() {
        System.out.print("Введите значение: ");

        double num;

        if (reader.hasNextDouble()) {
            num = reader.nextDouble();
        } else {
            System.out.print("Вы ввели неверное значение, попробуйте еще раз. ");
            reader.next();
            num = initiate();
        }
        return num;
    }

    public char initiateOperation() {
        System.out.print("Введите операцию: ");

        char operation;

        if (reader.hasNext()) {
            operation = reader.next().charAt(0);
        } else {
            System.out.print("Вы ввели неверно знак операции, попробуйте еще раз. ");
            reader.next();
            operation = initiateOperation();
        }
        return operation;
    }

    public double calculation(double x, double y, char operation) {
        double result;

        switch (operation) {
            case '+':
                result = addition(x, y);
                break;
            case '-':
                result = subtraction(x, y);
                break;
            case '*':
                result = multiplication(x, y);
                break;
            case '/':
                result = division(x, y);
                break;
            default:
                System.out.print("Вы допустили ошибку при вводе знака операции, попробуйте еще раз. ");
                result = calculation(x, y, initiateOperation());
        }
        return result;
    }
}
