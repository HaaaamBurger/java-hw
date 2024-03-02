package computer.abstractions;

import computer.enums.ESystem;

public abstract class Product {
    protected String model;
    protected String brand;
    protected ESystem system;
    protected String ram;

    protected Product(){};


    protected Product brand(String brand) {
        this.brand = brand;
        return this;
    }
    protected Product system(ESystem system) {
        this.system = system;
        return this;
    }
    protected Product model(String model) {
        this.model = model;
        return this;
    }
    protected Product ram(String ram) {
        this.ram = ram;
        return this;
    }
    protected String getValues() {
        return "\nModel: " + this.model + "\nBrand: " + this.brand + "\nSystem: " + this.system;
    }
}
