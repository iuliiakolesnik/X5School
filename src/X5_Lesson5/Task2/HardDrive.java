package X5_Lesson5.Task2;
//Характеристики накопителя: производитель, объем памяти, тип накопителя(HDD или SSD), форм-фактор.

public class HardDrive extends Characteristic {
    private String type;
    private String formFactor;

    public HardDrive(){
        super("test", 100);
        this.type = "SSD";
        this.formFactor = "test";
    }

    public String getManufacturer(){
        return super.getManufacturer();
    }
}
