package abstraction;

import java.util.Scanner;

public interface Animals {
    // Các hằng số
    String NAME = "Animal";
    int AGE = 2;

    // Các phương thức trừu tượng
    public abstract void inputData(Scanner sc);
    void displayData();
}
