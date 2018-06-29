package Composite;

/**
 * Interface describing an element, a basic or composite one
 */
public interface StoredElement {
    /**
     * @return Total price of all products contained in a given element
     */
    public double TotalPrice();

    /**
     * @return Total weight of all products contained in a given element
     */
    public double TotalWeight();

    /**
     * @return Quantity of all products contained in a given element
     */
    public int Quantity();
}
