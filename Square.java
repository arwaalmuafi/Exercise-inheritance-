public class Square extends Rectangle{

    Square(){

    }


  Square(double width,double length) {
      super(width, length);
         
    }

    Square(double side) {
         super(side);
      }
      Square(double side,String color, boolean filled) {
      super(side,"green",true);
         
      }

    public void setSide(double side) {
      super.setWidth(side);
       
    }

    public double getSide() {
        return super.getWidth();
    }

    @Override
    public double getArea() {
        return super.getWidth()* super.getWidth();
    }

    @Override
    public double getPerimeter() {
        return (super.getWidth())*4;
    }

    @Override
    public String toString() {
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
    }


}
