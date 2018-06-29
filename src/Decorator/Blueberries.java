package Decorator;

/**
 * Blueberries - Concrete Addition to a Pancake
 *
 * @author Adam Dębczak
 */
public class Blueberries extends PancakeDecorator {
    /**
     * Class constructor
     *
     * @param p Pancake to be decorated
     */
    public Blueberries(Pancake p) {
        super(p);
    }

    /**
     * Adding blueberries to a pancake
     */
    @Override
    public void Serve() {
        super.Serve();
        System.out.println("+ added Blueberries");
    }
}
