package homework1214;

public class Car {

    void engineStart() {
        System.out.println("regular start");
    }

}

class Mercedes extends Car {

    int price = 50000;

    void engineStart() {
        System.out.println("Mercedes start");
    }

}

class Main {

    public static void main(String[] args) {

        Car car1 = new Mercedes();
        car1.engineStart();
        System.out.println(((Mercedes)car1).price);

    }


}