package lt.sdacademy.advanced_features.concurrency.example1;


import org.apache.log4j.Logger;

public class ConcurrencyExample1 {

    private static final Logger logger = Logger.getLogger(ConcurrencyExample1.class);

    public static void main(String[] args) {
        logger.info("Main thread starts");

        try {
            Thread.sleep(2000); // main threada sustabdo tiek laiko per sleap parametra
            logger.info("Main thread is still running");
            Thread.sleep(3000);
            logger.info("Main thread ends");
        } catch (InterruptedException e){
            logger.error("Thread was interruptes on sleep", e);
        }
    }
}
