package Bai4;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(20,10);

        System.out.println("Diện tích hình tròn là: " + circle.area());
        System.out.println("Diện tich hình chữ nhật là: " + rectangle.area());

        System.out.println("Diện tích hình tròn là: " + shape.area(4));
        System.out.println("Diện tich hình chữ nhật là: " + rectangle.area(18, 25));
    }
}
