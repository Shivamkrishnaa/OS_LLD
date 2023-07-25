package Os.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NumberPrinter implements Runnable {
    int n;
    NumberPrinter(int n) {
        this.n = n;
    }
    @Override
    public void run(){
        System.out.println(" Printing: " + n + " Printing: " +Thread.currentThread().getName());
    }
}
public class PrintNumber {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 100; i++) {
            NumberPrinter n = new NumberPrinter(i);
            if (i == 30) {
                System.out.println("Shivam krishna");
            }
            es.submit(n);
        }
        es.shutdown();

    }
}
