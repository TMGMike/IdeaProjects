package Week10_Practical9;

import java.util.ArrayList;

/**
 * Created by u1764905 on 07/12/2017.
 */
public class ChristmasClub {
    private static ArrayList<Member> members;

    public static void main(String[] args) {
        members = new ArrayList<>();

        Member member1 = new Member("Gary", 25);
        members.add(member1);

        Member member2 = new Member("Tony", 20);
        members.add(member2);

        Member member3 = new Member("Rubiya", 22);
        members.add(member3);

        Member member4 = new Member("Steve", 18);
        members.add(member4);

        FindMembers();
        System.out.println("The total contributions are: " + TotalContributions());

        FindContribution("Test");
        System.out.println("They can buy: " + TurkeyCount(10) + " turkeys!");
    }

    private static void FindContribution(String contributor) {
        boolean found = false;
        for (Member member : members){
            if (member.getName().equals(contributor)){
                System.out.println(contributor + "'s contribution is: " + member.getContribution());
                found = true;
            }
        }

        if(!found) {
            System.out.println("The name '" + contributor + "' couldn't be found.");
        }
    }

    private static void FindMembers() {
        System.out.println("The current members are: \n" + members);
    }

    private static int TotalContributions() {
        int total = 0;
        for (Member member : members){
            total+= member.getContribution();
        }
        return total;
    }
    private static int TurkeyCount (int cost){
        return TotalContributions() / cost;
    }
}

