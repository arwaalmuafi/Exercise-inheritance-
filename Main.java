public class Main {
    public static void main(String[] args) {

        // Testing Shape
        Shape shape1 = new Shape();
        System.out.println("Shape1: " + shape1);

        System.out.println("---------------------------------------------------------");

        // Testing Circle
        Circle circle1 = new Circle();
        System.out.println("Circle1: " + circle1);
        System.out.println("Circle1 Area: " + circle1.getArea());
        System.out.println("Circle1 Perimeter: " + circle1.getPerimeter());

        System.out.println("---------------------------------------------------------");

        // Testing Rectangle
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle1: " + rectangle1);
        System.out.println("Rectangle1 Area: " + rectangle1.getArea());
        System.out.println("Rectangle1 Perimeter: " + rectangle1.getPerimeter());

        System.out.println("---------------------------------------------------------");

        // Testing Square
        Square square1 = new Square();
        System.out.println("Square1: " + square1);
        System.out.println("Square1 Area: " + square1.getArea());
        System.out.println("Square1 Perimeter: " + square1.getPerimeter());

    }
}
