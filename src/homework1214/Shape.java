package homework1214;

public class Shape {
    void printMessageShape() {
        System.out.println("This is Shape");
    }
}

class Rectangle1 extends Shape {
    void printMessageRectangle1() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void printMessageCircle() {
        System.out.println("This is circular shape");
    }
}

class Square1 extends Rectangle1 {
    void printMessageSquare1() {
        System.out.println("Square is a rectangle");
    }
}

class main3 {
    public static void main(String[] args) {

        Square1 s = new Square1();
        s.printMessageShape();
        s.printMessageRectangle1();
    }
}