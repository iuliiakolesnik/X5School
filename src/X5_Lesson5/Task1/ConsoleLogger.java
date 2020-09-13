package X5_Lesson5.Task1;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log into console: " + message);
    }
}
