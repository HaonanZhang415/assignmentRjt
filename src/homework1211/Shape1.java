package homework1211;

public abstract class Shape1 {

    public abstract Double calculatePerimeter();

}

class Circle1 extends Shape1 {

    private Float radius;

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public Circle1(Float radius) {
        this.radius = radius;
    }

    @Override
    public Double calculatePerimeter() {
        return (6.28 * radius);
    }
}

class Rectangle1 extends Shape1 {

    private Float length;
    private Float breadth;

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getBreadth() {
        return breadth;
    }

    public void setBreadth(Float breadth) {
        this.breadth = breadth;
    }

    public Rectangle1(Float length, Float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public Double calculatePerimeter() {
        return (2.00 * length + 2.00 * breadth);
    }
}

class Square1 extends Shape1 {

    private Float side;

    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }

    public Square1(Float side) {
        this.side = side;
    }

    @Override
    public Double calculatePerimeter() {
        return (side * 4.00);
    }
}

class Main1 {

    public static void main(String[] args) {
        Square1 s1 = new Square1(5.2f);
        System.out.println(s1.calculatePerimeter());
    }

}