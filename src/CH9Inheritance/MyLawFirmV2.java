package CH9Inheritance;
//This program is a client program to instantiate
//bunch of employees for a law firm. This version
//uses an array of objects of the type Employees. Each
// object is created directly at the instantiation of the
// employee array. The array is then passed to a method to
//print each employee's information

public class MyLawFirmV2 {
    public static void main(String args[]) {
        EmployeeV1[] myEmployees = new EmployeeV1[3];

        EmployeeV1 tom = new LegalSecretaryV2();
        myEmployees[0] = tom;

        EmployeeV1 jonny = new MarketerV2();
        myEmployees[1] = jonny;

        EmployeeV1 henry = new LawyerV2();
        myEmployees[2] = henry;

        printInfo(myEmployees);
    }

    public static void printInfo(EmployeeV1[] employee) {
        for (int i = 0; i <employee.length; i++) {
            System.out.println("salary: " + employee[i].getSalary());
            System.out.println("V. Days: " + employee[i].getVacationDays());
            System.out.println("V. Form: " + employee[i].getVacationForm());
            System.out.println();
        }
    }
}

