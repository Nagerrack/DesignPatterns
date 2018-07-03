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
     * Get the price of a single product
     *
     * @return Price of a single product
     */
    @Override
    public double TotalPrice() {
        return price;
    }

    /**
     * Get the weight of a single product
     *
     * @return Weight of a single product
     */
    @Override
    public double TotalWeight() {
        return weight;
    }

    /**
     * Get the quantity of a single product
     *
     * @return Quantity of a single product
     */
    @Override
    public int Quantity() {
        return 1;
    }

    /**
     * Get the product's name
     *
     * @return Name used for displaying a whole tree-like structure of elements contained in one another
     */
    @Override
    public String toString() {
        return name + '\n';
    }
}
