package Decorator;

/**
 * Pancake Decorator Class
 *
 * @author Adam Dębczak
 */
public class PancakeDecorator implements Pancake {
    protected Pancake p;

    /**
     * Class constructor
     *
     * @param p Pancake to be decorated
     */
    public PancakeDecorator(Pancake p) {
        this.p = p;
    }

    /**
     * Serving a Pancake
     */
    @Override
    public void Serve() {
        this.p.Serve();
    }
}
