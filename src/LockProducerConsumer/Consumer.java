package LockProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{
    Queue<Object> cars;
    int cap;
    Semaphore ps;
    Semaphore cs;
    Lock lock;
    Consumer(Queue<Object> cars, int cap, Semaphore ps, Semaphore cs) {
        this.cars = cars;
        this.cap = cap;
        this.ps = ps;
        this.cs = cs;
    }
    Consumer(Queue<Object> cars, int cap, Lock lock) {
        this.cars = cars;
        this.cap = cap;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
//            try {
//                cs.acquire();
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
        lock.lock();
//            synchronized (cars) {
                System.out.println(cars.size() + " : From consumer");
                if (cars.size() > 0) {
                    cars.remove();
                }
//                ps.release();
//            }
        lock.unlock();
        }
    }
}
