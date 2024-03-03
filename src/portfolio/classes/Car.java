package portfolio.classes;

public class Car {
    private String model;
    private short year;
    private short power;

    public Car model(String model) {
        this.model = model;
        return this;
    }

    public Car year(short year) {
        this.year = year;
        return this;
    }

    public Car power(short power) {
        this.power = power;
        return this;
    }

    public String toString() {
        return "{" + "\n\tModel: " + this.model +
                "\n\tYear: " + this.year +
                "\n\tPower: " + this.power +
                "\n}";
    }

}
