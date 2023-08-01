package HW8;

public class Rectangle extends Shape{
    private double width;
    private double length;

    Rectangle(){
        width=1.0;
        length=1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = getLength() * getWidth();
        return area;
    }

    public double getPerimeter() {
        double perimeter= 2 * (getWidth() + getLength());
        return perimeter;
    }

    public String toString() {
         System.out.printf("A Rectangle with width= " +getWidth() +" and length= " +getLength()+ " and area= "+ getArea()+" and perimeter= "+ getPerimeter() + " which is a subclass of ");
        System.out.println(super.toString());
        return "";
    }
}
