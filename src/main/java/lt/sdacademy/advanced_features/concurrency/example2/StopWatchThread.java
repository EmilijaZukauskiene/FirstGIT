package lt.sdacademy.advanced_features.concurrency.example2;

public class StopWatchThread extends Thread {

    private String prefix;

    public StopWatchThread(String prefix) {
        this.prefix=prefix;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Stop watch: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}