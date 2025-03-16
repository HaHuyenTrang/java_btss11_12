package Bai6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new PartimeEmployee("Trang", 19, 4500000, 4);
        employees[1] = new FullTimeEmployee("Huyền", 10, 5000000, 2400000);
        employees[2] = new Intern("Hà", 11, 3200000);

        for (Employee employee : employees) {
            employee.showInfo();
        }
    }
}
