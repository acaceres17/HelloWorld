package CH9Inheritance;

public class SecretaryV3 extends EmployeeV3 {
    //** state fields and constructors are not inherited **
    public SecretaryV3(String name, int years) {
        super(name, years);

    }
    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);

    }

}
