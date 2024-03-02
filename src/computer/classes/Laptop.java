package computer.classes;

import computer.enums.ESystem;
import computer.interfaces.ILaptop;

public class Laptop extends Computer implements ILaptop {
    private String battery_life;

    public Laptop battery_life(int battery_life) {
        this.battery_life = battery_life + "hours";
        return this;
    }

    public Laptop brand(String brand) {
        super.brand = brand;
        return this;
    }
    public Laptop system(ESystem system) {
        super.system = system;
        return this;
    }
    public Laptop model(String model) {
        super.model = model;
        return this;
    }
    public Laptop ram(int ram) {
        super.ram = ram;
        return this;
    }

    @Override
    public String getValues() {
        return "\nModel: " + this.model + "\nBrand: " + this.brand + "\nSystem: " + this.system + "\nBattery life: " + this.battery_life;
    }
}
