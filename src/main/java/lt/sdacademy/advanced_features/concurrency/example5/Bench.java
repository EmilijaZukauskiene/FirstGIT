package lt.sdacademy.advanced_features.concurrency.example5;

public class Bench {
    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void takeASeat() {
        if (availableSeats > 0) {
            System.out.println("Take a seat.");
            availableSeats--;
            System.out.println("Free seats left: " + availableSeats);
        } else {
            System.out.println("There are no available seats. :(");
        }
    }

    public void methodWithSyneCodeBlock() {
        System.out.println("Unsyced part");
        synchronized (this) { //  nuo sitos vietos pabaigus vienam Threadui darba gali vykdyti kitas (funkcijos blokas)
            System.out.println("Synced part");
            if (availableSeats > 0) {
                System.out.println("Take a seat.");
                availableSeats--;
                System.out.println("Free seats left:" + availableSeats);
            } else {
                System.out.println("There are no available seats.:(");
            }
        }
    }
}
