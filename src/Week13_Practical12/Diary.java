package Week13_Practical12;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by u1764905 on 07/12/2017.
 */
public class Diary {
    private static ArrayList<Job> jobs;

    public static void main(String[] args) {
        jobs = new ArrayList<>();

        Job job1 = new Job("Buy Groceries for food", 3);
        jobs.add(job1);

        Job job2 = new Job("Clean the Floor", 1, false);
        jobs.add(job2);

        Job job3 = new Job("Find all of the Gordon Ramsay memes.", 10, false);
        jobs.add(job3);

        Job job4 = new Job("Play Overwatch", 0);
        jobs.add(job4);

        Job job5 = new Job("Cook food", 2);
        jobs.add(job5);

        // Displays the diary in the unsorted form.
        FindJobs();
        FindJobs("food");

        // Sorts the jobs by priority, and prints the new order out.
        Collections.sort(jobs);
        FindJobs();

        System.out.println("Setting '" + job1.getDescription() + "' to complete.");
        job1.setCompleted(true);
        jobs.remove(job1);

        FindJobs();
    }

    private static void FindContribution(String contributor) {
        boolean found = false;
        for (Job job : jobs){
            if (job.getDescription().equals(contributor)){
                System.out.println(contributor + "'s contribution is: " + job.getPriority());
                found = true;
                job.compareTo(job);
            }
        }

        if(!found) {
            System.out.println("The name '" + contributor + "' couldn't be found.");
        }
    }

    private static void FindJobs() {
        System.out.println("The current jobs are: \n" + jobs);
    }

    private static void FindJobs(String search) {
        for (Job job : jobs) {
            if(job.getDescription().contains(search)){
                System.out.println(job);
            }
        }
    }

    private static int TotalContributions() {
        int total = 0;
        for (Job job : jobs){
            total+= job.getPriority();
        }
        return total;
    }
    private static int TurkeyCount (int cost){
        return TotalContributions() / cost;
    }

}

