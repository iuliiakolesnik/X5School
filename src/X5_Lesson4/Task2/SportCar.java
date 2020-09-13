package X5_Lesson4.Task2;

public class SportCar extends Car {

    private double speedLimit;

    SportCar(String model, String carClass, double weight, Engine engine, double speedLimit) {
        super(model, carClass, weight, engine);
        this.speedLimit = speedLimit;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("speedLimit: " + this.speedLimit + " model: " + this.getModel() + " classCar: " + this.getCarClass() + " weight: " + this.getWeight() + " enginePower: " + this.getEngine().getPower() + " engineManufacturer: " + this.getEngine().getManufacturer());
    }
}
