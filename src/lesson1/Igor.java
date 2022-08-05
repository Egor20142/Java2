package lesson1;

public class Igor extends Team {
    private boolean next;

    public Igor(int power, int speed, int intellect) {
        super(power, speed, intellect);
        this.next = super.isNext();
    }

    @Override
    public String toString() {
        return "Igor{" +
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

