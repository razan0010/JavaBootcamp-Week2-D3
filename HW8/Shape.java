package HW8;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color ="green";
        filled =true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString() {
         System.out.println("A Shape with color of "+ getColor()+ ", Is filled? "+ isFilled());
        return "";
    }
}
