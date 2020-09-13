package X5_Lesson5.Task1;

public class DbLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}
