package Week10_Practical9;

/**
 * Created by u1764905 on 07/12/2017.
 */
public class Member {
    private String name;
    private int contribution;

    public Member(String name, int contribution) {
        this.name = name;
        this.contribution = contribution;
    }

    public Member(String name) {
        this.name = name;
        this.contribution = 0;
    }

    public String getName() {
        return name;
    }

    public int getContribution() {
        return contribution;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }
    @Override
    public String toString() {
        return "\n Name: " + name + "  Contribution: " + contribution;
    }
}
