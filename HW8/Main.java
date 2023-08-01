package HW8;

public class Main {
    public static void main(String[] args) {

        Shape sh = new Shape("Red", false);
        System.out.println(sh.toString());

        Circle c = new Circle("Green", true, 7);
        System.out.println(c.toString());

        Rectangle r = new Rectangle("Gray", false, 2.5, 2.5);
        System.out.println(r.toString());

        Square s = new Square(5.5 , "Blue", true);
        System.out.println(s.toString());
    }
    }