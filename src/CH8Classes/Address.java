package CH8Classes;

public class Address {
    //state field
    private int housenum;
    private String aptnum;
    private String street;
    private String city;
    private String state;
    private int zip;
    //Constructors
    public Address(int housenum,String street, String city,
                   String state, int zip) {
        this.housenum = housenum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public Address(String aptnum,String street, String city,
                   String state, int zip) {
        this.aptnum = aptnum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


}
