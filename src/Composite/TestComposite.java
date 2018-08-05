package Composite;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Class for testing Package Composite
 *
 * @author Adam Debczak
 */
public class TestComposite {

    private static final int NUMBER_OF_PRODUCTS = 10;
    private static final double PRODUCT_PRICE = 5.0;
    private static final double PRODUCT_WEIGHT = 1.0;

    /**
     * Test checking whether composite contains expected amounts of products after addition
     */
    @Test
    public void testSumValues() {

        Package storage = new Package();

        for (int i = 0; i < NUMBER_OF_PRODUCTS; i++) {
            storage.addElement(new Product("Product" + i, PRODUCT_PRICE, PRODUCT_WEIGHT));
        }

        storage.addElement(new Package(NUMBER_OF_PRODUCTS, PRODUCT_PRICE, PRODUCT_WEIGHT));

        //Expected values doubled - Composite contains a package and products both in number = NUMBER_OF_PRODUCTS
        final double expectedPrice = 2 * NUMBER_OF_PRODUCTS * PRODUCT_PRICE;
        final double expectedWeight = 2 * NUMBER_OF_PRODUCTS * PRODUCT_WEIGHT;
        final int expectedQuantity = 2 * NUMBER_OF_PRODUCTS;

        assertThat(storage.TotalPrice()).isEqualTo(expectedPrice);
        assertThat(storage.TotalWeight()).isEqualTo(expectedWeight);
        assertThat(storage.Quantity()).isEqualTo(expectedQuantity);
    }
}
