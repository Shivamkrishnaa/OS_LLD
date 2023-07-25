package Os.LockAdderSubstractor2;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Count count;
    Boolean flag;
    Lock lock;
    public Adder(Count count, Boolean flag) {
        this.count = count;
        this.flag = flag;
    }
    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
//            while(!flag) {
//                continue;
//            }
//            flag = false;
            // Lock
            lock.lock();
            System.out.println("this is adder"+count.value);
            count.value += i;
            lock.unlock();
//            flag = true;
            // Lock
        }
    }
}
