package LockAdderSubtractor;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count count;
    Lock lock;
    Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // Lock
            lock.lock();
            count.value -= 1;
            // Lock
            lock.unlock();
            System.out.println("-"+i);
        }
    }
}
