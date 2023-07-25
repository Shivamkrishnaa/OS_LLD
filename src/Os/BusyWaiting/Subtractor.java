package Os.BusyWaiting;

public class Subtractor implements Runnable{
    Count count;
    Boolean flag;
    public Subtractor(Count count, Boolean flag) {
        this.count = count;
        this.flag = flag;
    }
    public Subtractor(Count count) {
        this.count = count;
    }
    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
            // Lock
            while(!flag) {
                continue;
            }
            flag = false;
            count.value -= i;
            // Lock
            flag = true;
            System.out.println("This is subtractor"+count.value);
        }
    }
}
