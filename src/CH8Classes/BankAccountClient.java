package CH8Classes;

public class BankAccountClient {
    public static void main (String[] args) {

//Address antonioAddress = new Address(914, "palmer ave", "mamaroneck","New York", 10543);
//Dob antonioDob = new Dob(17, 8, 2002);
       // AntonioCaceresBankAccountV2 henry = new AntonioCaceresBankAccountV1("Henry Baton", "123456789", "1 rochelle road",
        //        "09062001", 1000000, 0000);
        AntonioCaceresBankAccountV2 antonio = new AntonioCaceresBankAccountV2("Antonio Caceres",
        "987654321",new Address(914, "palmer ave", "mamaroneck","New York", 10543),
                new Dob(17, 8, 2002) , 100000, 0001);
        antonio.Deposit(1500);
        System.out.println(antonio);
        antonio.Withdrawl(10000);
        System.out.println(antonio);

    }

    
}

