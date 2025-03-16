package bai6;

public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion("YoYo", 2);
        Elephant elephant = new Elephant("ZaZa", 1);

        lion.move();
        lion.sound();
        elephant.move();
        elephant.sound();

    }
}
