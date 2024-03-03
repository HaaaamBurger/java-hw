package user.abstractions;

public abstract class Person {
    protected static int id;
    protected String name;
    protected String username;
    protected String email;
    protected String phone;
    protected String website;

    public Person() {
        id++;
    }
    public Person(String name, String username, String email, String phone, String website) {
        id++;

        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.website = website;
    }
    public void setValues(String name, String username, String email, String phone, String website) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.website = website;
    }
    public String getValues() {
        return "Id: " + id + "\nName: " + this.name + "\nUsername: " + this.username + "\nEmail: " + this.email + "\nPhone: " + this.phone + "\nWebsite: " + this.website;
    }

}
