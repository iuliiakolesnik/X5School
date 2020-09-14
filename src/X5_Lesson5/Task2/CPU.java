package X5_Lesson5.Task2;
//Характеристики процессора: тактовая чистота, кол-во ядер, кеш память, название, производитель.


public class CPU {
    private double coreSpeed;
    private int coreCount;
    private int RAM;
    private String model;
    private String manufacturer;

    public String getModel()
    {
        return this.model;
    }

    public CPU()
    {
        this.coreSpeed = 15;
        this.coreCount= 8;
        this.RAM = 16;
        this.model = "Samsung";
        this.manufacturer = "Samsung";
    }

    public void freeze(){
        System.out.println("Запущен холодный старт");
    }

    public void execute()
    {
        System.out.println("Процессор запущен");
    }
}
