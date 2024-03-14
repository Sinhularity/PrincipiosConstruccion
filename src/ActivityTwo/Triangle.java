package ActivityTwo;

public class Triangle extends Figure{
    private int width;
    private int height;
    public Triangle() {
        super(3);
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
        return Math.round((float) (getHeight()*getWidth()) /2);
    }

    @Override
    public int getPerimeter() {
        // Let's suppose that it is an Isosceles Triangle
        return getWidth() + getHeight() * 2;
    }
}
