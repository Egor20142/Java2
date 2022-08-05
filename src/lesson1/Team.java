package lesson1;

public class Team {
    private String teamName;
    private Team[] arrays;
    private int power;
    private int speed;
    private int intellect;
    private boolean next;

    public Team(String TeamName, Team[] arrays) {
        this.teamName = TeamName;
        this.arrays = arrays;
    }

    public Team(int power, int speed, int intellect) {
        this.power = power;
        this.speed = speed;
        this.intellect = intellect;
        this.next = true;
    }

    public void Results() {
        for (Team t : arrays) {
            if (t.isNext())
                System.out.println(t.getClass().getSimpleName() + " Good ");
        }
    }

    public void memberOfTheTeam() {
        System.out.println("Team " + teamName + ":");
        for (Team t : arrays) {
            System.out.println(t.toString());
        }
        System.out.println();
    }

    public boolean isNext() {
        return next;
    }

    public Team[] getArray() {
        return arrays;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setNext(boolean next) {
        this.next = next;
    }
}






