package computer.classes;

import computer.enums.ESystem;

public class Workstation extends Laptop {
    private String gpu;

    public Workstation pgu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public Workstation brand(String brand) {
        super.brand = brand;
        return this;
    }
    public Workstation system(ESystem system) {
        super.system = system;
        return this;
    }
    public Workstation model(String model) {
        super.model = model;
        return this;
    }
    public Workstation ram(int ram) {
        super.ram = ram;
        return this;
    }

    @Override
    public String getValues() {
        return "\nModel: " + this.model + "\nBrand: " + this.brand + "\nSystem: " + this.system + "\nGPU: " + this.gpu;
    }
}
