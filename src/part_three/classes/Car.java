package part_three.classes;

public class Car {
    private String model;
    private float power;
    private float price;
    private Owner owner;
    private short year;

    public Car(String model, float power, float price, Owner owner, short year) {
        this.model = model;
        this.power = power;
        this.price = price;
        this.owner = owner;
        this.year = year;
    }

    public void upgradePower(float percentage) {
        this.power += this.power * percentage;
    }
    public void showCar() {
        System.out.println(
                "--------------------" +
                "\nmodel: " + this.model +
                        "\npower: " + this.power +
                        "\nprice: " + this.price +
                        "\nowner: {" +
                            "\n\t\tname: " + this.owner.getName() +
                            "\n\t\tage: " + this.owner.getAge() +
                            "\n\t\texp: " + this.owner.getExp() +
                            "\n\t\tisQualified: " + this.owner.getIsQualified() +
                        "\n\t}" +
                        "\nyear: " + this.year
        );
    }
}
