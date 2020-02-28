package lt.sdacademy.advanced_features.concurrency.exercise1;

public class Main {
    public static void main(String[] args) {

        Hello hello1 = new Hello(1000);
        new Thread(hello1).start();

        Hello hello2 = new Hello(100);
        new Thread(hello2).start();
        hello1.stopMe();

        Hello hello3 = new Hello(10);
        new Thread(hello3).start();
        hello2.stopMe();
        hello3.stopMe();
    }
}

/*

    Create a class implementing the Runnable interface (implementing the run method):
        a) Inside the run method display „Hello!"
        b) Create a class object.
        c) Start the thread receiving the created object as a parameter (new Thread (<object>).start ())
        d) Create several objects, run a separate thread for each of them.
        e) Add the constructor to the created class, that accepts the int value.
        f) For the displayed data inside the run method, add the received value (Hello + value).
        g) Add a method to the class that will modify the int value.
        h) Add a while loop to the run method, inside which it will print the modified int value every few seconds.
        i) Add the ability to disable (gracefully shutdown) the thread. Why shouldn't we just „kill" the thread?*/
