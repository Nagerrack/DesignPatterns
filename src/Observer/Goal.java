package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Goal Class representing a goal scored for a certain team
 * Holds a list of observers spectating the event
 *
 * @author Adam Debczak
 */
public class Goal {

    private List<Observer> observers = new ArrayList<Observer>();
    private String scoringTeam;

    /**
     * Default class constructor
     */
    public Goal() {
    }

    /**
     * @return The team that scored current goal
     */
    public String getScoringTeam() {
        return scoringTeam;
    }

    /**
     * Setting the state of the subject and notifying all observers
     *
     * @param scoringTeam Team that scored a certain goal
     */
    public void setScoringTeam(String scoringTeam) {
        this.scoringTeam = scoringTeam;
        notifyAllObservers();
    }

    /**
     * Attach observer to an event
     * @param observer Spectator observing the goal
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * Notify all observers
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}