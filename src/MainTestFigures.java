import ActivityTwo.*;

public class MainTestFigures {
    public static void main(String[] args) {
        Rectangle TestRec01 = new Rectangle();
        Triangle TestTri01 = new Triangle();
        TestRec01.setWidth(4);
        TestRec01.setHeight(3);

        System.out.println("Area: "+TestRec01.getArea());
        System.out.println("Perimeter: "+ TestRec01.getPermieter());

        TestRec01.changeDimensions(3);

        System.out.println("New area: "+TestRec01.getArea());
        System.out.println("New perimeter: "+TestRec01.getPermieter());
    }
}
