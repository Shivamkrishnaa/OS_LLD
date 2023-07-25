package Os.LockAdderSubstractor2;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count count;
    Boolean flag;
    Lock lock;
    public Subtractor(Count count, Boolean flag) {
        this.count = count;
        this.flag = flag;
    }
    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }
    public Subtractor(Count count) {
        this.count = count;
    }
    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
            // Lock
//            while(!flag) {
//                continue;
//            }
            lock.lock();
//            flag = false;
            count.value -= i;
            lock.unlock();
            // Lock
//            flag = true;
            System.out.println("This is subtractor"+count.value);
        }
    }
}
