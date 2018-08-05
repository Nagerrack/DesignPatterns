package Composite;

/**
 * Composite pattern Implementation
 *
 * @author Adam Debczak
 */
public class Main {

    public static void main(String[] args) {

        Package storage = new Package();

        storage.addElement(new Package(2, 10.5, 2.5));
        for (int i = 0; i < 5; i++) {
            storage.addElement(new Product("Product" + i, Math.pow(2, i) - i, i * 1.25));
        }
        storage.addElement(new Package(4, 10.5, 2.5));

        System.out.println("Total Price: " + storage.TotalPrice());
        System.out.println("Total Weight: " + storage.TotalWeight());
        System.out.println("Quantity: " + storage.Quantity());

        System.out.println(storage);
    }
}
