package CH8Classes;

public class AntonioCaceresBankAccountV1 {
    //states fields below
    private double balance;
    private int pin;
    private String name;
    private String ssn;
    private String address;
    private String dob;
    //constructors
    public AntonioCaceresBankAccountV1(String name, String ssn, String address ,String dob){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;

    }
    public AntonioCaceresBankAccountV1(String name, String ssn, String address ,String dob
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

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    //mutators
    public void deposit(double cash){
        this.balance += cash;
    }
    // there would be check deposit too but we will save that for chapter 9...
    public void withdraw(double amount){
        this.balance -= amount;
    }

    //toString
    @Override
    public String toString(){
        return "Name: " + name + "\nBalance: " + balance + "\n";
    }

}
