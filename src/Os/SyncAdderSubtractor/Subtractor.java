package Os.SyncAdderSubtractor;

public class Subtractor implements Runnable{
    Count count;
    public Subtractor(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // Lock
            synchronized (count) {
                count.value -= 1;
            }
            // Lock
        }
    }
}
