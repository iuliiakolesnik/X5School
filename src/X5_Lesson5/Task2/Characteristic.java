package X5_Lesson5.Task2;

public class Characteristic {
    private String manufacturer;
    private int volume;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    Characteristic(String manufacturer, int volume) {
        this.manufacturer = manufacturer;
        this.volume = volume;
    }
}
