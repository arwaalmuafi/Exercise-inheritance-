public class Circle  extends Shape{
   private double radius;

    Circle(){
        this.radius = 1.0;

    }
    Circle(double radius){
        this.radius = radius;

    }

    Circle(String color,boolean filled,double radius){
        super( color, filled);
        this.radius=radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }


    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+radius+" which is a subclass of "+ super.toString();
    }
}
