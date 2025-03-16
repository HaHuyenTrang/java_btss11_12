package bai7;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee( String name,  float paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public float calculateSalary() {
        return 8* paymentPerHour;
    }
}
