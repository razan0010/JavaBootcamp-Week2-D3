package HW8;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        radius =1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = getRadius()*getRadius() *3.14;
        return area;
    }
    public double getPerimeter() {
        double perimeter= 2 * 3.14 * getRadius();
        return perimeter;
    }

    public String toString() {
       System.out.printf("A Circle with radius= " + getRadius() + ", and area= " +getArea() + ", and perimeter=" + getPerimeter() + " which is a subclass of ");
        System.out.println(super.toString());
        return "";
    }
}
