package X5_Lesson5.Task2;

/*facade*/

public class Computer {
    private CPU cpu;
    private HardDrive hardDrive;
    private Memmory memmory;
    private VideoCard videoCard;

    public Computer(){
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
        this.memmory = new Memmory();
        this.videoCard = new VideoCard();
    }

    public void startComputer()
    {
        this.test();
        this.cpu.freeze();
        this.memmory.load("startPosition", hardDrive.getManufacturer());
        this.cpu.execute();
        this.videoCard.play();
    }

    public void test()
    {
        System.out.println("Тестирование процессора: " + cpu.getModel() + " жесткого диска от " + hardDrive.getManufacturer() + " памяти с объемом " + memmory.getVolume() + " и видеокартой с типом " + videoCard.getType() + " начато...");
        System.out.println("Завершено");
    }

    public void turnOff()
    {
        System.out.println("Работа компьютера завершена");
    }
}
