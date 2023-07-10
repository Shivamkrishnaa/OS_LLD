package H20;

import java.util.concurrent.Semaphore;

public class Oxygen implements Runnable {
    Semaphore hs;
    Semaphore os;
    Oxygen (Semaphore hs, Semaphore os) {
        this.hs = hs;
        this.os = os;
    }
    @Override
    public void run() {
        try {
            os.acquire();
        } catch (Exception e) {

        }
        System.out.println("O");
        hs.release(2);
    }
}
