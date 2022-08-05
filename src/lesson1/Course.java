package lesson1;

public class Course {
    private final int power;
    private final int speed;
    private final int intellect;

    public Course(int[] barriers) {
        this.power = barriers[0];
        this.speed = barriers[1];
        this.intellect = barriers[2];
    }

    public void doIt(Team Team) {
        lifting(power, Team);
        marathon(speed, Team);
        logicTask(intellect, Team);
    }

    public void lifting(int power, Team team) {
        for (Team t : team.getArray()) {
            if (t.isNext()) {
                if (t.getPower() >= power)
                    System.out.println(t.getClass().getSimpleName() + " passed 1 test. Moving on");
                else {
                    System.out.println(t.getClass().getSimpleName() + " going off the course");
                    t.setNext(false);
                }
            }
        }
        System.out.println();
    }

    public void marathon(int speed, Team team) {
        for (Team t : team.getArray()) {
            if (t.isNext()) {
                if (t.getSpeed() >= speed)
                    System.out.println(t.getClass().getSimpleName() + " goes off the distance and passed the 2nd test. Moving on");
                else {
                    System.out.println(t.getClass().getSimpleName() + " going off the course");
                    t.setNext(false);
                }
            }
        }
        System.out.println();
    }

    public void logicTask(int intellect, Team Team) {
        for (Team t : Team.getArray()) {
            if (t.isNext()) {
                if (t.getIntellect() >= intellect)
                    System.out.println(t.getClass().getSimpleName() + " gpassed the 3rd test");
                else {
                    System.out.println(t.getClass().getSimpleName() + " going off the course");
                    t.setNext(false);
                }
            }
        }
        System.out.println();
    }
}
