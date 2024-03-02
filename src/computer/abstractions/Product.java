package computer.abstractions;

import computer.enums.ESystem;

public abstract class Product {
    protected String model;
    protected String brand;
    protected ESystem system;
    protected int ram;

    public Product(){};


    public Product brand(String brand) {
        this.brand = brand;
        return this;
    }
    public Product system(ESystem system) {
        this.system = system;
        return this;
    }
    public Product model(String model) {
        this.model = model;
        return this;
    }
    public Product ram(int ram) {
        this.ram = ram;
        return this;
    }
    public String getValues() {
        return "\nModel: " + this.model + "\nBrand: " + this.brand + "\nSystem: " + this.system;
    }
}
