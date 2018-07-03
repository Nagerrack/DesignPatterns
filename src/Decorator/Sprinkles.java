package Decorator;

/**
 * Sprinkles - Concrete Addition to a Pancake
 *
 * @author Adam Debczak
 */
public class Sprinkles extends PancakeDecorator {
    /**
     * Class constructor
     *
     * @param p Pancake to be decorated
     */
    public Sprinkles(Pancake p) {
        super(p);
    }

    /**
     * Adding Sprinkles to a pancake
     */
    @Override
    public void Serve() {
        super.Serve();
        System.out.println("+ added Sprinkles");
    }
}
