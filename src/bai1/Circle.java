package bai1;
public class Circle {
    private double radius = 1;
    public Circle() {
    }

    public Circle(double radius) {
        if(radius <= 0)
            throw new RuntimeException("Lỗi");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return 2 * radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle" + "[" + radius + "]" + "\nArea = " + getArea() + "\nCircumference = " + getCircumference();
    }
}
