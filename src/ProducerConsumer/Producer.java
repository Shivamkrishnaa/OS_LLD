package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    Queue<Object> cars;
    int cap;
    Semaphore ps;
    Semaphore cs;
    Producer(Queue<Object> cars, int cap, Semaphore ps, Semaphore cs) {
        this.cars = cars;
        this.cap = cap;
        this.ps = ps;
        this.cs = cs;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ps.acquire();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(cars.size() + " : From Producer");
//            if (cars.size() < cap) {
                cars.add(new Object());
//            }
            cs.release();

        }

    }
}
