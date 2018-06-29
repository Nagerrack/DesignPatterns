package Observer;

/**
 * Abstract Observer Class
 *
 * @author Adam Dębczak
 */

public abstract class Observer {
    /**
     * Goal that is observed by spectators
     */
    protected Goal goal;

    public abstract void update();
}