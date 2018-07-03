package Composite;

/**
 * Interface describing an element, a basic or composite one
 *
 * @author Adam Debczak
 */
public interface StoredElement {
    /**
     * Get the price of all products contained in a given element
     *
     * @return Total price of all products contained in a given element
     */
    public double TotalPrice();

    /**
     * Get the weight of all products contained in a given element
     *
     * @return Total weight of all products contained in a given element
     */
    public double TotalWeight();

    /**
     * Get the quantity of all products contained in a given element
     *
     * @return Quantity of all products contained in a given element
     */
    public int Quantity();
}
