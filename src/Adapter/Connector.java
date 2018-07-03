package Adapter;

/**
 * Connector Interface
 *
 * @author Adam Debczak
 */
public interface Connector {
    /**
     * Basic Connection method
     *
     * @param in  Input of adapter connection
     * @param out Output of adapter connection
     */
    public void Connect(String in, String out);
}
