package Composite;

/**
 * Class representing a single Product
 *
 * @author Adam Debczak
 */
public class Product implements StoredElement {
    private String name;
    private double price;
    private double weight;

    /**
     * Class contructor
     *
     * @param name   Name of a product
     * @param price  Price
     * @param weight Weight
     */
    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    /**
     * @return Price of a single product
     */
    @Override
    public double TotalPrice() {
        return price;
    }

    /**
     * @return Weight of a single product
     */
    @Override
    public double TotalWeight() {
        return weight;
    }

    /**
     * @return Quantity of a single product
     */
    @Override
    public int Quantity() {
        return 1;
    }

    /**
     * @return Name used for displaying a whole tree-like structure of elements contained in one another
     */
    @Override
    public String toString() {
        return name + '\n';
    }
}
