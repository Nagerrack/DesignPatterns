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
     * @return Whether the connection was successful
     */
    public boolean Connect(String in, String out);
}
