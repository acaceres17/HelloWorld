package CH9Inheritance;
//This program is a client program to instantiate
//bunch of employees for a law firm
public class MyLawFirm {
    public static void main(String args[]) {
        EmployeeV1 tom = new LegalSecretaryV2();
        EmployeeV1 jonny = new MarketerV2();
        EmployeeV1 henry = new LawyerV2();
        System.out.println("Salary:" + tom.getSalary());
        printInfo(tom);
        printInfo(jonny);
        printInfo(henry);


    }   public static void printInfo(EmployeeV1 employee){
        System.out.println("salary: " +employee.getSalary());
        System.out.println("V. Days: " +employee.getVacationDays());
        System.out.println("V. Form: " +employee.getVacationForm());
        System.out.println();
    }
}


