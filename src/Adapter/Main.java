package Adapter;

/**
 * Adapter pattern Implementation
 *
 * @author AD
 */

public class Main {
    public static void main(String[]args)
    {
        Connector adapter = new ConnectionAdapter();
        adapter.Connect("vga","hdmi");
        adapter.Connect("dvi","hdmi");
    }
}
