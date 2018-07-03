package Decorator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Class for testing Pancake Decorator
 *
 * @author Adam Debczak
 */
public class TestDecorator {

    @Test
    public void testPancakewithSprinkles() {
        Pancake withSprinkles = new Sprinkles(new PlainPancake());
        assertEquals(withSprinkles.getClass(), Sprinkles.class);
    }

    @Test
    public void testPancakewithMapleSyrup() {
        Pancake withMapleSyrup = new MapleSyrup(new PlainPancake());
        assertEquals(withMapleSyrup.getClass(), MapleSyrup.class);
    }

    @Test
    public void testPancakewithBlueberries() {
        Pancake withBlueberries = new Blueberries(new PlainPancake());
        assertEquals(withBlueberries.getClass(), Blueberries.class);
    }
}
