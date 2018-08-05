package Adapter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing Connection Adapter
 *
 * @author Adam Debczak
 */
public class TestAdapter {

    private static final Connector adapter = new ConnectionAdapter();
    private static final String HDMI = "hdmi";
    private static final String VGA = "vga";
    private static final String DVI = "dvi";

    /**
     * Test checking whether supported adaption results in a successful connection
     */
    @Test
    public void testSupportedConnection() {

        assertThat(adapter.Connect(VGA, HDMI)).isTrue();
        assertThat(adapter.Connect(DVI, HDMI)).isTrue();
    }

    /**
     * Test checking whether unsupported adaption fails to connect
     */
    @Test
    public void testUnsupportedConnection() {

        assertThat(adapter.Connect(HDMI, VGA)).isFalse();
    }
}
