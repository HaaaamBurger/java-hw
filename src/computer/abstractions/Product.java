package computer.abstractions;

import computer.enums.ESystem;

import java.math.BigDecimal;

public abstract class Product {
    protected String title;
    protected String model;
    protected BigDecimal price;
    protected String brand;
    protected ESystem system;

    protected Product(String title, BigDecimal price, String model, String brand, ESystem system) {
        this.title = title;
        this.model = model;
        this.price = price;
        this.brand = brand;
        this.system = system;
    }
    protected Product(){};
    protected Product title(String title) {
        this.title = title;
        return this;
    }
    protected Product model(String model) {
        this.title = model;
        return this;
    }
    protected Product price(BigDecimal price) {
        this.price = price;
        return this;
    }
    protected Product brand(String brand) {
        this.brand = brand;
        return this;
    }
    protected Product system(ESystem system) {
        this.system = system;
        return this;
    }
    protected String getValues() {
        return "Title: " + this.title + "\nModel: " + this.model + "\nPrice: " + this.price + "\nBrand: " + this.brand + "\nSystem: " + this.system;
    }
}
