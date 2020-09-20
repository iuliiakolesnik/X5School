package X5_Lesson4.Task2;

//6. Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузов, реализовать методы start(), stop().
// Метод start – выводит на экран «Грузовик поехал», метод stop -   «грузовик остановился».
public class Lorry extends Car {

    private double liftingCapacity;

    public Lorry(String model, String carClass, double weight, Engine engine, double liftingCapacity) {
        super(model, carClass, weight, engine);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("liftingCapacity: " + this.liftingCapacity + " model: " + this.getModel() + " classCar: " + this.getCarClass() + " weight: " + this.getWeight() + " enginePower: " + this.getEngine().getPower() + " engineManufacturer: " + this.getEngine().getManufacturer());
    }
}
