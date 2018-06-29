package Decorator;

/**
 * Blueberries - Concrete Addition to a Pancake
 *
 * @author Adam Dębczak
 */

public class Blueberries extends PancakeDecorator {
    /**
     * @param p Pancake to be decorated
     */
    public Blueberries(Pancake p)
    {
        super(p);
    }

    @Override
    public void Serve() {
        super.Serve();
        System.out.println("+ added Blueberries");
    }
}
