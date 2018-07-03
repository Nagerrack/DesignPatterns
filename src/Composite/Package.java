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
     * @param storedElement Element to be added can be either a {@link Package} or a {@link Product}.
     */
    public void addElement(StoredElement storedElement) {
        content.add(storedElement);
    }

    /**
     * @return Content of a package
     */
    public List<StoredElement> getContent() {
        return content;
    }

    /**
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
