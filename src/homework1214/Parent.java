package homework1214;

public class Parent {

    private void printMethodP() {
        System.out.println("This is parent class");
    }

}

class Child extends Parent {

    void printMethodC(){
        System.out.println("This is child class");
    }

}

class main1 {

    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();

        //parent.printMethodP();
        child.printMethodC();
        //child.printMethodP();
    }
}