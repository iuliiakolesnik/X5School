package X5_Lesson5.Task2;
//Характеристики видеокарты: производитель, тип памяти, объем памяти, охлаждение(активное или пассивное).

public class VideoCard {
    private String manufacturer;
    private String type;
    private int volume;
    private String freeze;

    public VideoCard() {
        this.manufacturer = "test";
        this.type = "КЭШ";
        this.volume = 100;
        this.freeze = "Активное";
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public void play() {
        System.out.println("Воспроизвести видео");
    }


}
