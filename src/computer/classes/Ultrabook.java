package computer.classes;

import computer.enums.ESystem;

public class Ultrabook extends Laptop {
    private float weight;

    public Ultrabook weight(float weight) {
        this.weight = weight;
        return this;
    }

    public Ultrabook brand(String brand) {
        super.brand = brand;
        return this;
    }
    public Ultrabook system(ESystem system) {
        super.system = system;
        return this;
    }
    public Ultrabook model(String model) {
        super.model = model;
        return this;
    }
    public Ultrabook ram(int ram) {
        super.ram = ram;
        return this;
    }

    @Override
    public String getValues() {
        return "\nModel: " + this.model + "\nBrand: " + this.brand + "\nSystem: " + this.system + "\nWeight: " + this.weight;
    }
}
