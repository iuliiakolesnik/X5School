package X5_Lesson4.Task2;

public abstract class Car {

    private String model;
    private String carClass;
    private double weight;
    private Engine engine;

    Car(String model, String carClass, double weight, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    public String getModel() {
        return this.model;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getCarClass() {
        return this.carClass;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

}
