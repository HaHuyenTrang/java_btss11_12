package bai7;

public abstract class Employee implements IEmployee {
    private String name;
    protected float paymentPerHour;

    public Employee(String name, float paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPaymentPerHour(float paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public float getPaymentPerHour() {
        return paymentPerHour;
    }

    @Override
    public abstract float calculateSalary() ;
    @Override
    public String getName() {
        return name;
    }
}
