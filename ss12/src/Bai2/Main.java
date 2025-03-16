package Bai2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Tổng các số a+b là: " + calculator.add(1, 2));
        System.out.println("Tổng các số a+b+c là: " + calculator.add(1, 2, 3));
    }
}
