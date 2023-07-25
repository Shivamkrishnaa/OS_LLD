package Os.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Store {

    public static void main(String[] args) {
        Queue<Object> car = new ConcurrentLinkedDeque<>();
        int cap = 6;
        Semaphore ps = new Semaphore(6);
        Semaphore cs = new Semaphore(0);

        Producer p1 = new Producer(car, cap, ps, cs);
        Producer p2 = new Producer(car, cap, ps, cs);
        Producer p3 = new Producer(car, cap, ps, cs);
        Producer p4 = new Producer(car, cap, ps, cs);
        Producer p5 = new Producer(car, cap, ps, cs);
        Producer p6 = new Producer(car, cap, ps, cs);
        Producer p7 = new Producer(car, cap, ps, cs);
        Producer p8 = new Producer(car, cap, ps, cs);

        Consumer s1 = new Consumer(car, cap, ps, cs);
        Consumer s2 = new Consumer(car, cap, ps, cs);
        Consumer s3 = new Consumer(car, cap, ps, cs);
        Consumer s4 = new Consumer(car, cap, ps, cs);
        Consumer s5 = new Consumer(car, cap, ps, cs);
        Consumer s6 = new Consumer(car, cap, ps, cs);
        Consumer s7 = new Consumer(car, cap, ps, cs);

        Thread tp1 =  new Thread(p1);
        Thread tp2 =  new Thread(p2);
        Thread tp3 =  new Thread(p3);
        Thread tp4 =  new Thread(p4);
        Thread tp5 =  new Thread(p5);
        Thread tp6 =  new Thread(p6);
        Thread tp7 =  new Thread(p7);
        Thread tp8 =  new Thread(p8);

        Thread tc1 =  new Thread(s1);
        Thread tc2 =  new Thread(s2);
        Thread tc3 =  new Thread(s3);
        Thread tc4 =  new Thread(s4);
        Thread tc5 =  new Thread(s5);
        Thread tc6 =  new Thread(s6);
        Thread tc7 =  new Thread(s7);

        tp1.start();
        tp2.start();
        tp3.start();
        tp4.start();
        tp5.start();
        tp6.start();
        tp7.start();
        tp8.start();

        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        tc5.start();
        tc6.start();
        tc7.start();


    }
}
