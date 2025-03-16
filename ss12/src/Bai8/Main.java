package Bai8;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("product", 15000);
        System.out.println("Mua 1 :");
        product.displayInfo(1);

        System.out.println("Mua 150 :");
        product.displayInfo(150);

        Electronics electronics = new Electronics("Electronics", 2000);
        System.out.println("Mua 1 :");
        electronics.displayInfo(1);

        System.out.println("Mua 170 :");
        electronics.displayInfo(170);

        Clothing clothing = new Clothing("clothing", 5000);
        System.out.println("Mua 1 :");
        clothing.displayInfo(1);

        System.out.println("Mua 51 :");
        clothing.displayInfo(51);

        Food food = new Food("food", 12000);
        System.out.println("Mua 1 :");
        food.displayInfo(1);

        System.out.println("Mua 81 :");
        food.displayInfo(81);
    }
}
