package X5_Lesson5.Task2;
//Характеристики накопителя: производитель, объем памяти, тип накопителя(HDD или SSD), форм-фактор.

public class HardDrive {
    private String manufacturer;
    private int volume;
    private String type;
    private String formFactor;

    public HardDrive(){
        this.manufacturer = "test";
        this.volume = 100;
        this.type = "SSD";
        this.formFactor = "test";
    }

    public String getManufacturer(){
        return manufacturer;
    }
}
