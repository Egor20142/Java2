package lesson1;

public class Egor extends Team {
    private boolean next;

    public Egor(int power, int speed, int intellect) {
        super(power, speed, intellect);
        this.next = super.isNext();
    }

    @Override
    public String toString() {
        return "Egor{" +
                "power=" + super.getPower() +
                ", speed=" + super.getSpeed() +
                ", intellect=" + super.getIntellect() +
                '}';
    }

    public int getPower() {
        return super.getPower();
    }

    public int getSpeed() {
        return super.getSpeed();
    }

    public int getIntellect() {
        return super.getIntellect();
    }

    @Override
    public boolean isNext() {
        return next;
    }

    @Override
    public void setNext(boolean next) {
        this.next = next;
    }
}
