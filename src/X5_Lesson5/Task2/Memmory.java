package X5_Lesson5.Task2;
//Характеристики оперативной памяти: производитель, объем памяти, частота, тип памяти.

public class Memmory extends Characteristic {
    private double memmoryCount;
    private String memmoryType;

    public Memmory()
    {
        super("Test1", 32);
        this.memmoryCount = 15;
        this.memmoryType = "КЭШ";
    }

    public void load (String position, String data)
    {
        System.out.println("Инициализация памяти с позиции " + position + " на жестком диске: " + data);
    }
}
