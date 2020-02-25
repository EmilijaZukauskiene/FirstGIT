package lt.sdacademy.advanced_features.concurrency.exercise1;

public class Hello implements Runnable {

    private int number;
    private boolean finished;

    public Hello(int number) {
        this.number = number;
        this.finished = false;
    }

    public void increaseNumber() {
        number++;
    }

    public void stopMe() {
        this.finished = true;
    }

    @Override
    public void run() {
        while (number <= 0 || !finished) {
            try {
                System.out.println("Hello!" + number);
                increaseNumber();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
