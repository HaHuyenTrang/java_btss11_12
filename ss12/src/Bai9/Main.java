package Bai9;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("maybach");
        Vehicle bike = new Bike("vison");
        Vehicle bus = new Bus("Bus", 50);
        Vehicle airplane = new Airplane("VietNamAirlines", 10000);

        System.out.println("=== Di chuyển và âm thanh của các phương tiện ===");
        car.move();
        car.sound();
        car.move(3, 90);

        System.out.println();

        bike.move();
        bike.sound();
        bike.move(4, 20);

        System.out.println();

        bus.move();
        bus.sound();
        bus.move(6, 60);

        System.out.println();

        airplane.move();
        airplane.sound();
        airplane.move(2, 900);
    }
}
