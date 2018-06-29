package Decorator;

/**
 * Sprinkles - Concrete Addition to a Pancake
 *
 * @author AD
 */

public class Sprinkles extends PancakeDecorator {
    /**
     * @param p Pancake to be decorated
     */
    public Sprinkles(Pancake p)
    {
        super(p);
    }

    @Override
    public void Serve() {
        super.Serve();
        System.out.println("+ added Sprinkles");
    }
}
