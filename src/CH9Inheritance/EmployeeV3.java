// A class to represent employee in general (20 page manual)
package CH9Inheritance;

public class EmployeeV3 {
    //State fields
    private String name;
    private int yoe;

    public EmployeeV3(String name, int years) {
        this.name = name;
        this.yoe = years;
    }
    public String getName() {
        return name;
    }
    public int getYearsi() {
        return yoe;
    }

    public int getYoe() {
        return yoe;
    }

    public int getHours() {
        return 40; //works 40 hours per week
    }
    public double getSalary() {
        return 50000.0; //$40,000 / year
    }
    public int getVacationDays() {
        return 10; //2 weeks paid vacation
    }
    public String getVacationForm() {
        return "yellow"; //use the yellow form for leave
    }

}
