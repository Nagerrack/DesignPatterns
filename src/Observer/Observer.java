package Observer;

/**
 * Abstract Observer Class
 *
 * @author Adam Debczak
 */
public abstract class Observer {
    /**
     * Goal that is observed by spectators
     */
    protected Goal goal;

    /**
     * An action performed by an observer, depending on the state of the subject
     */
    public abstract void update();
}