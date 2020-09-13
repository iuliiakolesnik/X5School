package X5_Lesson5.Task1;

public class KafkaLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new KafkaLogger();
    }
}
