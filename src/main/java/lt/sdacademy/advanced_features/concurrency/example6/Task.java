package lt.sdacademy.advanced_features.concurrency.example6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {
    private String name;

    public Task(String s) {
        name = s;
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");

                Date d = new Date();
                if (i == 0) {
                    System.out.println("Initialization Time for" + "task name - " + name + "=" + ft.format(d));
                } else {
                    System.out.println("Executing Time for task name - " + name + "=" + ft.format(d));
                }
                Thread.sleep(1000);
            }
            System.out.println(name + "complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
