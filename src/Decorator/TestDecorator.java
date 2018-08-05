package Decorator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Class for testing Pancake Decorator
 *
 * @author Adam Debczak
 */
public class TestDecorator {

    /**
     * Test checking if object was successfully decorated with {@link Sprinkles}
     */
    @Test
    public void testPancakeWithSprinkles() {
        Pancake withSprinkles = new Sprinkles(new PlainPancake());
        assertThat(withSprinkles.getClass()).isEqualTo(Sprinkles.class);
    }

    /**
     * Test checking if object was successfully decorated with {@link MapleSyrup}
     */
    @Test
    public void testPancakeWithMapleSyrup() {
        Pancake withMapleSyrup = new MapleSyrup(new PlainPancake());
        assertThat(withMapleSyrup.getClass()).isEqualTo(MapleSyrup.class);
    }

    /**
     * Test checking if object was successfully decorated with {@link Blueberries}
     */
    @Test
    public void testPancakeWithBlueberries() {
        Pancake withBlueberries = new Blueberries(new PlainPancake());
        assertThat(withBlueberries.getClass()).isEqualTo(Blueberries.class);
    }
}
