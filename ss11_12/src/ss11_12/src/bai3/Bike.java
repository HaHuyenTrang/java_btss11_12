package bai3;

public class Bike extends Vehicle {
    public Bike(String name ,int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("name: "+getName()+ "speed: "+getSpeed());
    }
}
