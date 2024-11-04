public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle() {
        this.width = 1.0;
        this.length = 1.0;

    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;

    }

    Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public Rectangle(double side) {
    }

    public Rectangle(double side, String green, boolean b) {
    }

    public double getArea() {
        return width * length;
    }


    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();

    }

}
