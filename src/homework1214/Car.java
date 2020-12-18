package homework1214;

public class Car {

    protected void protectedMethod() {System.out.println("protected!");}

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

class CarWash {

    void washCar(Car car) {
        System.out.println("Car is being washed!");
    }

}

class Main {

    public static void main(String[] args) {

        Car car1 = new Mercedes();
        car1.engineStart();
        System.out.println(((Mercedes)car1).price);

        Mercedes mercedes = new Mercedes();
        new CarWash().washCar(mercedes);
    }


}