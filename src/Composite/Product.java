package Composite;

public class Product implements StoredElement {
    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public double TotalPrice() {
        return price;
    }

    @Override
    public double TotalWeight() {
        return weight;
    }

    @Override
    public int Quantity() {
        return 1;
    }

    @Override
    public String toString() {
        return name + '\n';
    }
}
