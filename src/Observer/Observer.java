package Observer;

/**
 * Abstract Observer Class
 *
 * @author AD
 */

public abstract class Observer {
    /**
     * Goal that is observed by spectators
     */
    protected Goal goal;

    public abstract void update();
}