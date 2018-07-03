package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a Package
 * Contains various products or other packages
 *
 * @author Adam Debczak
 */
public class Package implements StoredElement {

    private List<StoredElement> content;

    /**
     * Class constructor
     */
    public Package() {
        content = new ArrayList<>();
    }

    /**
     * Class constructor supporting creation of packages with a given amount of equal products
     *
     * @param amount Amount of equal products
     * @param price  Price
     * @param weight Weight
     */
    public Package(int amount, double price, double weight) {
        content = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            content.add(new Product("Product" + i, price, weight));
        }

    }

    /**
     * Add element to a Package
     *
     * @param storedElement Element to be added can be either a {@link Package} or a {@link Product}.
     */
    public void addElement(StoredElement storedElement) {
        content.add(storedElement);
    }

    /**
     * Get content of a package
     *
     * @return Content of a package
     */
    public List<StoredElement> getContent() {
        return content;
    }

    /**
     * Sum the price of all products contained in a Package
     *
     * @return Total price of all products contained in a Package
     */
    @Override
    public double TotalPrice() {
        double sum = 0;
        for (StoredElement se : content) {
            sum += se.TotalPrice();
        }
        return sum;
    }

    /**
     * Sum the weight of all products contained in a Package
     *
     * @return Total weight of all products contained in a Package
     */
    @Override
    public double TotalWeight() {
        double sum = 0;
        for (StoredElement se : content) {
            sum += se.TotalWeight();
        }
        return sum;
    }

    /**
     * Get the quantity of all products contained in a Package
     *
     * @return Quantity of all products contained in a Package
     */
    @Override
    public int Quantity() {
        int quantity = 0;
        for (StoredElement se : content) {
            quantity += se.Quantity();
        }
        return quantity;
    }

    /**
     * Convert package into a string describing its' content
     *
     * @return String used for displaying a whole tree-like structure of elements contained in one another
     */
    @Override
    public String toString() {
        String result = "Package:\n";
        for (StoredElement se : content) {
            result += se;
        }
        return result;
    }
}
