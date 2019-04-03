package CH9Inheritance;
//This program is a client program to instantiate
//bunch of employees for a law firm. This version
//uses an array of objects of the type Employees. Each
// object is created directly at the instantiation of the
// employee array. The array is then passed to a method to
//print each employee's information

public class MyLawFirmV3 {
    public static void main(String args[]) {
        EmployeeV3[] myEmployees = {new LegalSecretaryV3("Tom", 10),
                new MarketerV3("Jonny", 8),
                new LawyerV3("Henry", 5)};

        printInfo(myEmployees);
    }

    public static void printInfo(EmployeeV3[] employee) {
        //FOR EACH LOOP
        //Datatype    //iterator  //container
       for(EmployeeV3 staff       :employee) {
           System.out.println("name: " + staff.getName());
           System.out.println("salary: " + staff.getSalary());
           System.out.println("V. Days: " + staff.getVacationDays());
           System.out.println("V. Form: " + staff.getVacationForm());
           System.out.println("Years of experience: " + staff.getYoe() + " years");
           System.out.println();
       }
       /*
        for (int i = 0; i <employee.length; i++) {
            System.out.println("salary: " + employee[i].getSalary());
            System.out.println("V. Days: " + employee[i].getVacationDays());
            System.out.println("V. Form: " + employee[i].getVacationForm());
            System.out.println();
        }
        */
    }
}

