package X5_Lesson3.Task1;

public class MainClass {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", "+7(987)977-07-37", 10.8);
        Phone phone2 = new Phone("Honor", "+7(903)215-39-93", 15.8);
        Phone phone3 = new Phone("Apple", "+7(927)781-67-86", 9.8);

        phone1.print();
        phone2.print();
        phone3.print();

        phone1.receiveCall("Tom");
        phone2.receiveCall("Jane");
        phone3.receiveCall("John");

        phone1.receiveCall("Tom", phone2.getNumber());
        phone2.receiveCall("Jane", phone3.getNumber());
        phone3.receiveCall("John", phone1.getNumber());

        phone1.sendMessage(phone2.getNumber(), phone3.getNumber(), phone1.getNumber(), "+7(927)781-66-68");
    }
}
