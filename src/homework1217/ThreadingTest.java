package homework1217;


import homework1214.Car;

public class ThreadingTest {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {


        Thread t = new Thread() {

            @Override
            public void run() {
                for(int i = 0; i < 10; i++){System.out.println("thread t");}
            }
        };
        t.start();
        //t.sleep(10);
        t.interrupt();
        Thread.yield();
        for(int i = 0; i < 10; i++){System.out.println("main");}
        String d = "fdsdf";
        d.equals("dfsd");
        t.equals(t);

        Bmw bmw = new Bmw();
        

    }

}

class Bmw extends Car {

}
