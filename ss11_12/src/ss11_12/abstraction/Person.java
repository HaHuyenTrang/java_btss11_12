package abstraction;

import java.util.Scanner;

// Lớp trừu tượng
public abstract class Person {
    private String name;
    private int age;
    private boolean gender;

    public Person() {
    }

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public abstract int addTwoNumber(int a, int b);

    public abstract void hello();

    public void inputData(Scanner sc) {
        System.out.println("Nhập thông tin person");
    }

    public void displayData() {
        System.out.println("In thông tin person");
    }
}
