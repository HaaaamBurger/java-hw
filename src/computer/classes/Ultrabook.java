package computer.classes;

import computer.enums.ESystem;
import computer.interfaces.IUltrabook;

public class Ultrabook extends Laptop implements IUltrabook {
    private float weight;

    protected Ultrabook weight(float weight) {
        this.weight = weight;
        return this;
    }

    protected Ultrabook brand(String brand) {
        super.brand = brand;
        return this;
    }
    protected Ultrabook system(ESystem system) {
        super.system = system;
        return this;
    }
    protected Ultrabook model(String model) {
        super.model = model;
        return this;
    }
    protected Ultrabook ram(String ram) {
        super.ram = ram;
        return this;
    }

    @Override
    public String getValues() {
        return "\nModel: " + this.model + "\nBrand: " + this.brand + "\nSystem: " + this.system + "\nWeight: " + this.weight;
    }
}
