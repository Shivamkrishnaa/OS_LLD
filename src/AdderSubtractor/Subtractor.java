package AdderSubtractor;

public class Subtractor implements Runnable{
    Count count;
    public Subtractor(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // Lock
            count.value -= i;
            // Lock
            System.out.println("This is subtractor");
        }
    }
}
