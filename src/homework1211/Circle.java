package homework1211;

public class Circle implements Shape{

    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

}

interface  Shape {

    public double area();
}

class Main {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        System.out.println(c.area());
    }

}