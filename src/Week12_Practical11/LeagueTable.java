package Week12_Practical11;

import java.text.NumberFormat;
import java.util.Locale;

public class LeagueTable {

    public static void main (String[] args) {

        Team teamLeeds = new Team ("Leeds Rhinos", 32);
        Team teamHud = new Team ("Huddersfield Giants", 33);
        Team teamWigan = new Team("Wigan Warriors", 34);
        Team teamHull = new Team("Hull FC", 35);

        teamHud.playMatch (12,22);
       /** theTeam.addFundRaiser (new Team("Jim", "JI02", 62.23));
        theTeam.addFundRaiser (new Team("Alice", "AL03", 34.34));
        theTeam.addFundRaiser (new Team("Jane", "JA14", 72.99));
        theTeam.addFundRaiser (new Team("Emily", "EM25", 89.50));

        theTeam.sortTeam ();
        theTeam.printTeam ();
        **/
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);

        System.out.println ();
        // System.out.println ("Total Amount Raised: " + gb.format (theTeam.getTotalRaised ()));

    }
}
