package lt.sdacademy.advanced_features.concurrency.example4;

import lt.sdacademy.advanced_features.concurrency.example2.StopWatchThread;

public class ConcurrencyExample4 {

    public static void main(String[] args) {
        Thread stopWatchThread1 = new Thread();
        Thread stopWatchThread2 = new Thread();

        stopWatchThread1.start();
        stopWatchThread2.start();
    }
}
