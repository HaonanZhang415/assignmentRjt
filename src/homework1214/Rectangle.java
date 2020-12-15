package homework1214;

public class Rectangle {

    private int length;
    private int breadth;

    public void printArea() {
        System.out.println(length * breadth);
    }

    public void printPerimeter() {
        System.out.println(length * 2 + breadth * 2);
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Square extends Rectangle {

    private int side;

    public Square(int side) {
        super(side, side);
    }

}

class main2 {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 6);
        Square square = new Square(8);
        rectangle.printArea();
        rectangle.printPerimeter();
        square.printArea();
        square.printPerimeter();

        Square[] squareArray = {new Square(1), new Square(2), new Square(3), new Square(4), new Square(5), new Square(6), new Square(7), new Square(8), new Square(9), new Square(10)};
        for (Square s : squareArray) {
            s.printArea();
        }

    }

}