package Builder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing Kitchen Builder
 *
 * @author Adam Debczak
 */
public class TestBuilder {

    Kitchen kitchenExample;

    @Before
    public void init() throws Exception {
        kitchenExample = new Kitchen
                .KitchenBuilder(1, 1, "Table", "Oven", "Sink").build();
    }

    @Test
    public void testObjectCreation() {
        assertFalse(kitchenExample.isMicrowave());
        assertFalse(kitchenExample.isDishwasher());
    }

    @Test
    public void testAmounts() {
        int chairAmount = 4;
        int cupboardAmount = 6;

        kitchenExample = new Kitchen
                .KitchenBuilder(cupboardAmount, chairAmount, "Table", "Oven", "Sink").build();

        assertEquals(chairAmount, kitchenExample.getChairs());
        assertEquals(cupboardAmount, kitchenExample.getCupboards());
    }

    @Test
    public void testOptional() {
        int chairAmount = 4;
        int cupboardAmount = 6;

        kitchenExample = new Kitchen
                .KitchenBuilder(chairAmount, cupboardAmount, "Table", "Oven", "Sink")
                .setMicrowave(true).build();

        assertTrue(kitchenExample.isMicrowave());
    }
}
