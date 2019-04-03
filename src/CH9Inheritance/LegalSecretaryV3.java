package CH9Inheritance;

public class LegalSecretaryV3 extends SecretaryV3{
    //** state fields and constructors are not inherited **
    public LegalSecretaryV3(String name, int years) {
        super(name, years);
    }

    public double getSalary() {
         return super.getSalary() + 5000.0; //$45,000 / year
    }
}
