package Week12_Practical11;

import java.text.NumberFormat;
import java.util.Locale;

public class Team implements Comparable <Team> {

    private String name;
    private int wins;
    private int losses;
    private int draws;
    private int id;
    public Team(String name, int ID) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
        this.draws = 0;
        this.id = ID;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getId () {
        return id;
    }

    public int getWins () {
        return this.wins;
    }

    public void setWins (int wins) {
        this.wins = wins;
    }

    @Override
    public String toString () {
        return "Team{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", wins=" + wins + '\'' +
                ", losses=" + losses + '\'' +
                ", draws=" + draws +
                '}';
    }

    public void printFormatted () {
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);
        final String formatString = "%-4s %-12s %8s";

      //  System.out.println (String.format (formatString, this.id, this.name, gb.format (this.amountRaised)));
    }
    public void playMatch(int ownScore, int againstScore){
        if(ownScore > againstScore){
            wins++;
            System.out.println(String.format("%s won. Wins is now: %d", this.name, this.wins));
        }
        else if (ownScore < againstScore) {
            losses++;
            System.out.println(String.format("%s lost. Losses is now: %d", this.name, this.losses));
        }
        else {
            draws++;
            System.out.println(String.format("%s drew. Draws is now: %d", this.name, this.draws));
        }

    }
     @Override
    public int compareTo (Team team) {
    /**    if (team.amountRaised > this.amountRaised) {
            return 1;
        }
        else if (team.amountRaised < this.amountRaised) {
            return -1;
        }
        else {
            return 0;
        }**/
     return 0; // Temporary
    }


}
