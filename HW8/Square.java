package HW8;

public class Square extends Rectangle{
    Square(){
        double side = super.getWidth();
    }
    Square(double side){
        super.setWidth(side);
    }
    Square(double side, String color, boolean filled){
        super(color, filled);
        super.setWidth(side);
    }

    public void setSide(double side) {
        super.setWidth(side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public double getArea() {
        double area = super.getWidth() * super.getWidth();
        return area;
    }

    public double getPerimeter() {
        double perimeter=  4 * super.getWidth();
        return perimeter;
    }

    public String toString() {
         System.out.printf("A Square with side= " +getSide() + " and area= " +getArea() + " and perimeter= " +getPerimeter()  + " which is a subclass of ");
        System.out.println(super.toString());
        return "";
    }
}
