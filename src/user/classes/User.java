package user.classes;

import user.abstractions.Person;

import java.util.ArrayList;

public class User extends Person {
    private Address address;
    private Company company;

    public User(String name, String username, String email, String phone, String website) {
        super(name, username, email, phone, website);
    }

    public User(String name, String username, String email, String phone, String website, String street, String suite, String city, String zipcode, Geo geo) {
        super(name, username, email, phone, website);
        this.address = new Address(street, suite, city, zipcode, geo);
    }

    public void setAddress(String street, String suite, String city, String zipcode, Geo geo) {
        this.address = new Address(street, suite, city, zipcode, geo);
    }

    public void addCompany(Company company) {
        this.company = company;
    }

    @Override
    public String getValues() {
        return "id: " + super.id +
                "\nname: " + super.name +
                "\nusername: " + super.username +
                "\nemail: " + super.email +
                "\naddress: " +
                    "{" +
                        "\n\tstreet: " + this.address.street +
                        "\n\tsuite: " + this.address.suite +
                        "\n\tcity: " + this.address.city +
                        "\n\tzipcode: " + this.address.zipcode +
                        "\n\tgeo: " +
                            "{" +
                                "\n\t\tlat: " + this.address.geo.lat +
                                "\n\t\tlng: " + this.address.geo.lng +
                            "\n\t}" +
                    "\n}" +
                "\nphone: " + super.phone +
                "\nwebsite: " + super.website +
                "\ncompany: " +
                    "{" +
                        "\n\tname: " + this.company.name +
                        "\n\tcatchPhrase: " + this.company.catchPhrase +
                        "\n\tbs: " + this.company.bs +
                    "\n}"
                ;
    }
}
