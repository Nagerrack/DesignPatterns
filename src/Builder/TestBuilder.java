package Builder;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Class for testing Kitchen Builder
 *
 * @author Adam Debczak
 */
public class TestBuilder {

    private static final int CHAIR_AMOUNT = 4;
    private static final int CUPBOARD_AMOUNT = 6;

    private Kitchen kitchenExample;

    @Before
    public void init() {
        kitchenExample = new Kitchen
                .KitchenBuilder(1, 1, "Table", "Oven", "Sink").build();
    }

    /**
     * Test checking whether optional attributes are not set after default creation
     */
    @Test
    public void testObjectCreation() {
        assertThat(kitchenExample.hasMicrowave()).isFalse();
        assertThat(kitchenExample.hasDishwasher()).isFalse();
    }

    /**
     * Test checking whether builder is setting the right amounts
     */
    @Test
    public void testAmounts() {

        kitchenExample = new Kitchen
                .KitchenBuilder(CUPBOARD_AMOUNT, CHAIR_AMOUNT, "Table", "Oven", "Sink").build();

        assertThat(kitchenExample.getChairs()).isEqualTo(CHAIR_AMOUNT);
        assertThat(kitchenExample.getCupboards()).isEqualTo(CUPBOARD_AMOUNT);
    }

    /**
     * Test checking whether an optional atribute is true after explicitly setting during build
     */
    @Test
    public void testOptional() {

        kitchenExample = new Kitchen
                .KitchenBuilder(CHAIR_AMOUNT, CUPBOARD_AMOUNT, "Table", "Oven", "Sink")
                .setMicrowave(true).build();

        assertThat(kitchenExample.hasMicrowave()).isTrue();
    }
}
