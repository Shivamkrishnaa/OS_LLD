package H20;

import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Semaphore hs = new Semaphore(2);
        Semaphore os = new Semaphore(1);

        Hydrogen h = new Hydrogen(hs, os);
        Oxygen o = new Oxygen(hs, os);

        for (int i = 0; i < 10; i++) {
//            Thread ht = new Thread(h);
            Thread ot = new Thread(o);
//            ht.start();
            ot.start();
        }

    }
}
