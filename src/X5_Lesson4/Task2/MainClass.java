package X5_Lesson4.Task2;

public class MainClass {

    public static void main(String[] args) {
        Engine engine1 = new Engine("200", "Ferrari");
        Engine engine2 = new Engine("300", "Ford");

        Car[] cars = new Car[2];

        cars[0] = new Lorry("lorry", "S", 40, engine1, 500);
        cars[1] = new SportCar("sportCar", "C", 30, engine2, 300);

        for (Car car : cars) {
            car.printInfo();
            car.start();
            car.turnLeft();
            car.turnRight();
            car.stop();
        }
    }
}