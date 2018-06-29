package Adapter;

/**
 * Connection Adapter Class for handling Adapters
 *
 * @author AD
 */

public class ConnectionAdapter implements Connector {
    DVItoHDMI dvItoHDMI;
    VGAtoHDMI vgAtoHDMI;

    public ConnectionAdapter() {
        dvItoHDMI = new DVItoHDMI();
        vgAtoHDMI = new VGAtoHDMI();
    }

    /**
     * Implementation of method handling proper adapter choice
     *
     * @param in  Input of adapter connection
     * @param out Output of adapter connection
     */
    public void Connect(String in, String out) {
        if (out.equalsIgnoreCase("hdmi")) {
            if (in.equalsIgnoreCase("vga")) {
                vgAtoHDMI.Connect();
            }

            if (in.equalsIgnoreCase("dvi")) {
                dvItoHDMI.Connect();
            }
        } else {
            System.out.println("Unsupported adapter format");
        }

    }

}