package ActivityTwo;

public class Rectangle extends Figure implements ReshapeFigure {
    private int width;
    private int height;

    public Rectangle() {
        super(4);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public int getPerimeter() {
        return (getHeight() * 2 + getWidth() * 2);
    }

    @Override
    public void changeDimensions(int factorX) {
        this.height = getHeight()*factorX;
        this.width = getWidth()*factorX;
    }
}
