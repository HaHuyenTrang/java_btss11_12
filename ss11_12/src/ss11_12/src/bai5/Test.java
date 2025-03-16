package bai5;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle("blue", 23);
        Rectangle r = new Rectangle(5, 5, "red");
        Square s = new Square(4, 8, "green");
        c.displayInfo();
        r.displayInfo();
        s.displayInfo();
    }
}
