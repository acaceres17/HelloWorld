package CH8Classes;

public class AntonioCaceresBankAccountV2 {
    //states fields below
    private double balance;
    private int pin;
    private String name;
    private String ssn;
    private Address address;
    private Dob dob;
    //constructors
    public AntonioCaceresBankAccountV2(String name, String ssn, Address address , Dob dob){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;

    }
    public AntonioCaceresBankAccountV2(String name, String ssn, Address address , Dob dob
    , double balance, int pin){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
        this.balance =balance;
        this.pin = pin;
    }
    //indicators
    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public Address getAddress() {
        return address;
    }

    public Dob getDob() {
        return dob;
    }

    //mutators
    public void Deposit(double cash){
        this.balance += cash;
    }
    // there would be check deposit too but we will save taht for chapter 9...
    public void Withdrawl(double amount){
        this.balance -= amount;
    }

    //toString
    @Override
    public String toString(){
        return "Name: " + name + "\nBalance: " + balance + "\n";
    }

}
