package Bai5;



public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(3);
        Shape shape2 = new Rectangle(20, 10);
        Shape shape3 = new Square(5);

        System.out.println("Diện tích hình tròn là: " + shape1.area());
        System.out.println("Diện tich hình chữ nhật là: " + shape2.area());
        System.out.println("Diện tích hình vuông là: " + shape3.area());
    }
}
