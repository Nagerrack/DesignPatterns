package Observer;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Class for testing Goal Observer
 *
 * @author Adam Debczak
 */
public class TestObserver {

    private Goal goal;

    @Before
    public void init() {
        String team1 = "TeamA";
        String team2 = "TeamB";

        goal = new Goal();

        new Spectator(goal, "Spectator1", team1);
        new Spectator(goal, "Spectator2", team2);
        new Spectator(goal, "Spectator3", team1);
    }

    /**
     * Test checking whether the right amount of observers are subscribed after creation
     */
    @Test
    public void testObserverAddition() {
        assertThat(goal.getObservers()).hasSize(3);
    }
}
