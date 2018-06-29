package Decorator;

/**
 * MapleSyrup - Concrete Addition to a Pancake
 *
 * @author AD
 */

public class MapleSyrup extends PancakeDecorator{

    /**
     * @param p Pancake to be decorated
     */
    public MapleSyrup(Pancake p)
    {
        super(p);
    }

    @Override
    public void Serve() {
        super.Serve();
        System.out.println("+ added Maple Syrup");
    }
}
