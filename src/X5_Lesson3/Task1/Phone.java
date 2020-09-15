package X5_Lesson3.Task1;

public class Phone {
    private String model;
    private String number;
    private double weight;

    public Phone(){
        this.model = "none";
        this.number = "none";
        this.weight = 0;
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, String number, double weight) {
        this(model, number);
        this.weight = weight;
    }

    public String getNumber() {
        return this.number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " Номер: " + number);
    }

    public void sendMessage(String number, String... arg) {
        System.out.println(number);
        for (String i : arg) {
            System.out.println(i);
        }
    }

    public void print() {
        System.out.println("Model: " + this.model + " Number: " + this.number + " Weight: " + this.weight);
    }
}

