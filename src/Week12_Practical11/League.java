package Week12_Practical11;

import java.util.ArrayList;
import java.util.Collections;

public class League {

    private static final String TEAM_NAME = "Poppleton Dogs Home";

    private ArrayList <Team> teams;

    public League () {
        teams = new ArrayList<> ();
    }

    public void addFundRaiser (Team fr) {
        this.teams.add (fr);
    }

    public void sortTeam () {
        Collections.sort (this.teams);
    }

    public double getTotalRaised () {

        double totalRaised = 0.0;

        for (Team fr : teams) {
          //  totalRaised += fr.getAmountRaised ();
        }

        return totalRaised;
    }

    private void printTeamHeader () {
        System.out.println (TEAM_NAME);
        for (int i = 0; i < TEAM_NAME.length (); i ++) {
            System.out.print ("=");
        }

        System.out.println ();
    }

    public void printTeam () {

        if (this.teams.isEmpty ()) {
            System.out.println ("No fund raisers in this team.");
        }
        else {
            printTeamHeader ();

            System.out.println ();

            for (Team fr : teams) {
                fr.printFormatted ();
            }
        }
    }
}
