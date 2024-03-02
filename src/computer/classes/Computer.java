package computer.classes;

import computer.enums.ESystem;
import computer.abstractions.Product;
import computer.interfaces.IComputer;

import java.math.BigDecimal;


public class Computer extends Product implements IComputer {
    private String graphicCard;
    private short monitors;

    public Computer(String title, BigDecimal price, String model, String brand, ESystem system) {
        super(title, price, model, brand, system);
    }
    public Computer(){};

    public Computer graphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
        return this;
    }
    public Computer monitors(short monitors) {
        this.monitors = monitors;
        return this;
    }


}
