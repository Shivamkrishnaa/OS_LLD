package LockProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable {
    Queue<Object> cars;
    int cap;
    Semaphore ps;
    Semaphore cs;
    Lock lock;
    Producer(Queue<Object> cars, int cap, Semaphore ps, Semaphore cs) {
        this.cars = cars;
        this.cap = cap;
        this.ps = ps;
        this.cs = cs;
    }
    Producer(Queue<Object> cars, int cap, Lock lock) {
        this.cars = cars;
        this.cap = cap;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
//            try {
//                ps.acquire();
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
            lock.lock();
            System.out.println(cars.size() + " : From Producer");
            if (cars.size() < cap) {
                cars.add(new Object());
            }
//            cs.release();
lock.unlock();
        }

    }
}
