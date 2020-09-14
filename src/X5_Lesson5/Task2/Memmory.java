package X5_Lesson5.Task2;
//Характеристики оперативной памяти: производитель, объем памяти, частота, тип памяти.

public class Memmory {
    private String manufacturer;
    private int volume;
    private double memmoryCount;
    private String memmoryType;

    public Memmory()
    {
        this.manufacturer = "Intel";
        this.volume = 126;
        this.memmoryCount = 15;
        this.memmoryType = "КЭШ";
    }

    public void load (String position, String data)
    {
        System.out.println("Инициализация памяти с позиции " + position + " на жестком диске: " + data);
    }
}
