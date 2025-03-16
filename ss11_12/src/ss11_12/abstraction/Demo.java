package abstraction;

public class Demo {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Person gián tiếp thừ lớp Person
        Person person = new Person() {
            @Override
            public int addTwoNumber(int a, int b) {
                return a + b;
            }

            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };
    }
}
