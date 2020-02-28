package lt.sdacademy.advanced_features.concurrency.example3;

import lt.sdacademy.advanced_features.concurrency.example2.StopWatchThread;

public class StopWatchTread extends Thread {

    private String prefix;

    public void StopWatchThread(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(prefix + "" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
