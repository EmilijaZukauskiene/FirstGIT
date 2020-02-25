package lt.sdacademy.advanced_features.concurrency.example5;

public class SeatTakerThread extends Thread {

    private Bench bench;

    public SeatTakerThread(Bench bench) {
        this.bench = bench;
    }

    @Override
    public void run() {
 //       bench.takeASeat();
        bench.methodWithSyneCodeBlock();
    }
}
