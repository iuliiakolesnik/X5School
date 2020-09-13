package X5_Lesson4.Task2;

public class Engine {

    private String power;
    private String manufacturer;

    public String getPower() {
        return this.power;
    }


    public String getManufacturer() {
        return this.manufacturer;
    }

    Engine(String power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

}
