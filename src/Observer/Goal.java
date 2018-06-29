package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Goal class representing a goal scored for a certain team
 *
 * @author Adam Dębczak
 */

public class Goal {

    private List<Observer> observers = new ArrayList<Observer>();
    private String scoringTeam;

    public String getScoringTeam() {
        return scoringTeam;
    }

    /**
     * @param scoringTeam Team that scored a certain goal
     */
    public void setScoringTeam(String scoringTeam) {
        this.scoringTeam = scoringTeam;
        notifyAllObservers();
    }

    /**
     * Attach observer to an event
     */

    public void attach(Observer observer){
        observers.add(observer);
    }


    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}