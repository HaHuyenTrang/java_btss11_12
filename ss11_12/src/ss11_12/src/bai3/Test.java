package bai3;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Maybach ", 33000);
        car.displayInfo();
        car.start();

        Bike bike = new Bike("Honda ", 12000);
        bike.displayInfo();
        bike.start();

    }
}
