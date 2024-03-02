package computer.classes;

import computer.enums.ESystem;
import computer.interfaces.IWorkstation;

public class Workstation extends Laptop implements IWorkstation {
    private String gpu;

    protected Workstation pgu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    protected Workstation brand(String brand) {
        super.brand = brand;
        return this;
    }
    protected Workstation system(ESystem system) {
        super.system = system;
        return this;
    }
    protected Workstation model(String model) {
        super.model = model;
        return this;
    }
    protected Workstation ram(String ram) {
        super.ram = ram;
        return this;
    }

    @Override
    public String getValues() {
        return "\nModel: " + this.model + "\nBrand: " + this.brand + "\nSystem: " + this.system + "\nGPU: " + this.gpu;
    }
}
