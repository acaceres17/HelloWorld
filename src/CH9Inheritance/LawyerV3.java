package CH9Inheritance;

public class LawyerV3 extends EmployeeV3 {
    //** state fields and constructors are not inherited **
    public LawyerV3(String name, int years) {
        super(name, years);
    }
    //inherit methods form the Employees class
    //override the inherited methods from the Employee class

    public int getVacationDays() {
        return 15; //2 weeks paid vacation
    }

    public String getVacationForm() {
        return "pink"; //use the pink form for leave
    }
    public void sue() {
        System.out.println("I'll see you in court!");
    }
}

