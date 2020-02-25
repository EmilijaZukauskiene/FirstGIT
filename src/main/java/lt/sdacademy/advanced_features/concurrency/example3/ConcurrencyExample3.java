package lt.sdacademy.advanced_features.concurrency.example3;

import lt.sdacademy.advanced_features.concurrency.example2.ConcurrencyExample2;
import lt.sdacademy.advanced_features.concurrency.example2.StopWatchThread;
import org.apache.log4j.Logger;

public class ConcurrencyExample3 {
    private static final Logger logger = Logger.getLogger(ConcurrencyExample3.class);

    public static void main(String[] args) {
        StopWatchThread stopWatchThread1 = new StopWatchThread("SW1");
        StopWatchThread stopWatchThread2 = new StopWatchThread("SW2");

        stopWatchThread1.start(); //pastartinti stopWachThreas klase
        stopWatchThread2.start(); //pastartinti stopWachThreas klase



        logger.info("Main thread starts");
        try {
            Thread.sleep(2000); // main threada sustabdo tiek laiko per sleap parametra
            logger.info("Main thread is still running");
            Thread.sleep(3000);
            logger.info("Main thread ends");
        } catch (InterruptedException e) {
            logger.error("Thread was interruptes on sleep", e);
        }
    }
}
