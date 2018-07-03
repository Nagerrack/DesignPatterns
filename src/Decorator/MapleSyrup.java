package Decorator;

/**
 * MapleSyrup - Concrete Addition to a Pancake
 *
 * @author Adam Debczak
 */
public class MapleSyrup extends PancakeDecorator {

    /**
     * Class constructor
     *
     * @param p Pancake to be decorated
     */
    public MapleSyrup(Pancake p) {
        super(p);
    }

    /**
     * Adding Maple Syrup to a pancake
     */
    @Override
    public void Serve() {
        super.Serve();
        System.out.println("+ added Maple Syrup");
    }
}
