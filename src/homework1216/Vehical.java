package homework1216;

public interface Vehical {

    String type = "land vehicle";

    void engineStart();
    void brake();

}

class Bus implements Vehical {

    int noOfWheels = 10;
    String model = "Mercedes";
    int coloe = 0;

    @Override
    public void engineStart() {
        System.out.println("bus engine start");
    }

    @Override
    public void brake() {
        System.out.println("bus brake");
    }
}

class Car implements Vehical {

    int noOfWheels = 4;
    String model = "BMW";
    int coloe = 0;

    @Override
    public void engineStart() {
        System.out.println("car engine start");
    }

    @Override
    public void brake() {
        System.out.println("car brake");
    }
}

class Truck implements Vehical {

    int noOfWheels = 18;
    String model = "Volvo";
    int coloe = 0;

    @Override
    public void engineStart() {
        System.out.println("truck engine start");
    }

    @Override
    public void brake() {
        System.out.println("truck brake");
    }

    public void loadContainer() {
        System.out.println("truck loading container");
    }
}

class main0 {
    public static void main(String[] args){
        Truck t = new Truck();
        t.engineStart();
        t.loadContainer();

        System.out.println(Vehical.type);

        Vehical v = new Truck();
        ((Truck)v).loadContainer();
        System.out.println(((Truck) v).noOfWheels);

        Bus b = new Bus();
    }
}