package Chapter2_5;

public class Sheep {
    private int x;
    private int y;

    public Sheep(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "The sheep is on the" + x + "and" + y + ".";
    }
}
