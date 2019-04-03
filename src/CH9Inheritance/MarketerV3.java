package CH9Inheritance;

public class MarketerV3 extends EmployeeV3{
    //** state fields and constructors are not inherited **
    public MarketerV3(String name, int years) {
        super(name, years);
    }
    public double getSalary() {
        //I want to add 10000.0 to the base employee class
        return super.getSalary() + 10000.0; //$50,000 / year
    }
    public void advertise() {
        System.out.println("I'll convince you to hire our law firm");
    }
}
