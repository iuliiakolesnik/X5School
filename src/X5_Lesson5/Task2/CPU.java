package X5_Lesson5.Task2;
//Характеристики процессора: тактовая чистота, кол-во ядер, кеш память, название, производитель.


public class CPU extends Characteristic {
    private double coreSpeed;
    private int coreCount;
    private String model;


    public String getModel() {
        return this.model;
    }

    public double getCoreSpeed() {
        return this.coreSpeed;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public CPU() {
        super("Samsung", 100);
        this.coreSpeed = 15;
        this.coreCount = 8;
        this.model = "Samsung";
    }

    public void freeze() {
        System.out.println("Запущен холодный старт");
    }

    public void execute() {
        System.out.println("Процессор запущен");
    }
}
