package Observer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing Goal Observer
 *
 * @author Adam Debczak
 */
public class TestObserver {

    Goal goal;

    @Before
    public void init() {
        String team1 = "TeamA";
        String team2 = "TeamB";

        goal = new Goal();

        new Spectator(goal, "Spectator1", team1);
        new Spectator(goal, "Spectator2", team2);
        new Spectator(goal, "Spectator3", team1);
    }

    @Test
    public void testObserverAddition() {
        assertEquals(3, goal.getObservers().size());
    }


}
