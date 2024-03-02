package computer.classes;

import computer.enums.ESystem;
import computer.abstractions.Product;
import computer.interfaces.IComputer;

public class Computer extends Product implements IComputer { ;
    private short monitors;

    public Computer(){};

    protected Computer brand(String brand) {
        super.brand = brand;
        return this;
    }
    protected Computer system(ESystem system) {
        super.system = system;
        return this;
    }
    protected Computer model(String model) {
        super.model = model;
        return this;
    }
    protected Computer ram(String ram) {
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
