package bai10;

public class Test {
    public static void main(String[] args) {
        // Tạo nhân viên
        Manager manager = new Manager("Htrang", 8000);
        Developer developer = new Developer("Chang", 5000);

       manager.work();
       manager.takeVacation();
       manager.attendMeeting();

       developer.work();
       developer.takeVacation();

    }
}
