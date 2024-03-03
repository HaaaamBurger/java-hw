package user.classes;

public class Address{
    protected String street;
    protected String suite;
    protected String city;
    protected String zipcode;
    protected Geo geo;

    public Address(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }
    @Override
    public String getValues() {
        return "Street: " + this.street + "\nSuite: " + this.suite + "\nCity: " + this.city + "\nZipcode: " + this.zipcode;
    }
}
