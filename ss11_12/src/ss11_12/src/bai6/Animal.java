package bai6;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = this.name;
        this.age = this.age;
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

    public abstract void sound();
    public abstract void move() ;


}
