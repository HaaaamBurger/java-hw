package computer.classes;

import computer.enums.ESystem;
import computer.interfaces.ILaptop;

public class Laptop extends Computer implements ILaptop {
    private String battery_life;

    protected Laptop battery_life(int battery_life) {
        this.battery_life = battery_life + "hours";
        return this;
    }

    protected Laptop brand(String brand) {
        super.brand = brand;
        return this;
    }
    protected Laptop system(ESystem system) {
        super.system = system;
        return this;
    }
    protected Laptop model(String model) {
        super.model = model;
        return this;
    }
    protected Laptop ram(String ram) {
        super.ram = ram;
        return this;
    }

    @Override
    public String getValues() {
        return "\nModel: " + this.model + "\nBrand: " + this.brand + "\nSystem: " + this.system + "\nBattery life: " + this.battery_life;
    }
}
