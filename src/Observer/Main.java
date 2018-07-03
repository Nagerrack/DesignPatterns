package Observer;

/**
 * Observer pattern Implementation
 *
 * @author Adam Debczak
 */
public class Main {
    public static void main(String[] args) {

        String team1 = "TeamA";
        String team2 = "TeamB";

        Goal goal = new Goal();

        new Spectator(goal, "Spectator1", team1);
        new Spectator(goal, "Spectator2", team2);
        new Spectator(goal, "Spectator3", team1);

        System.out.println(team1 + " scores");
        goal.setScoringTeam(team1);
        System.out.println(team2 + " scores");
        goal.setScoringTeam(team2);
        System.out.println(team1 + " scores");
        goal.setScoringTeam(team1);

    }

}