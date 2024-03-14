package ActivityTwo;

public abstract class Figure {
    private int amountSides;

    public Figure(int amountSides) {
        this.amountSides = amountSides;
    }

    public int getAmountSides() {
        return amountSides;
    }

    public abstract int getArea ();
    public abstract int getPerimeter();
}
