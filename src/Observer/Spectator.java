package Observer;

/**
 * Concrete implementation of an observer
 * Spectator that performs an action depending which team scored a goal
 */

public class Spectator extends  Observer {
    String name;
    String team;

    public Spectator(Goal goal, String name,String team)
    {
        this.goal = goal;
        this.name = name;
        this.team = team;
        this.goal.attach(this);

    }
    public void update()
    {
        if(goal.getScoringTeam().equals(team))
        {
            System.out.println(name +" cheers");
        }
        else
        {
            System.out.println(name +" boos");
        }
    }
}