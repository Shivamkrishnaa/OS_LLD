package H20;

import java.util.concurrent.Semaphore;

public class Hydrogen implements Runnable {
    Semaphore hs;
    Semaphore os;
    Hydrogen (Semaphore hs, Semaphore os) {
        this.hs = hs;
        this.os = os;
    }
    @Override
    public void run() {
        try {
            os.acquire();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("H");

    }
}
