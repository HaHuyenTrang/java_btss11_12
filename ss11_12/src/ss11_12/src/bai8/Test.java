package bai8;

public class Test {
    public static void main(String[] args) {
        ElectricCar electriccar = new ElectricCar("VinFat", 2023, 50000);
        GasCar gascar = new GasCar("HonDa", 2022, 35000);

        electriccar.refuel();
        electriccar.stop();
        electriccar.start();
        gascar.refuel();
        gascar.stop();
        gascar.start();
    }
}
