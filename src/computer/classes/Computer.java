package computer.classes;

import computer.enums.ESystem;
import computer.abstractions.Product;

public class Computer extends Product { ;
    private short monitors;

    public Computer(){};

    public Computer brand(String brand) {
        super.brand = brand;
        return this;
    }
    public Computer system(ESystem system) {
        super.system = system;
        return this;
    }
    public Computer model(String model) {
        super.model = model;
        return this;
    }
    public Computer ram(int ram) {
        super.ram = ram;
        return this;
    }

    public Computer monitors(short monitors) {
        this.monitors = monitors;
        return this;
    }

    @Override
    public String getValues() {
        return "\nModel: " + this.model + "\nBrand: " + this.brand + "\nSystem: " + this.system + "\nMonitors: " + this.monitors;
    }

}
