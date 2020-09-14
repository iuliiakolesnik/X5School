package X5_Lesson5.Task2;
//Характеристики видеокарты: производитель, тип памяти, объем памяти, охлаждение(активное или пассивное).

public class VideoCard extends Characteristic {
    private String type;
    private String freeze;

    public VideoCard() {
        super("test", 100);
        this.type = "КЭШ";
        this.freeze = "Активное";
    }

    public String getManufacturer(){
        return super.getManufacturer();
    }

    public String getType(){
        return this.type;
    }

    public void play() {
        System.out.println("Воспроизвести видео");
    }


}
