package bai7;

public class PartTimeEmployee extends Employee {
    private float workingHours ;

    public PartTimeEmployee(String name, float paymentPerHour,float workingHours) {
        super(name,paymentPerHour);
        this.workingHours = workingHours;

    }
    public float getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(float workingHours) {
        this.workingHours = workingHours;
    }


    @Override
    public float calculateSalary() {
        return workingHours * paymentPerHour;
    }

}
