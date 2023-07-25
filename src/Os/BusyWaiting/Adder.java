package Os.BusyWaiting;

public class Adder implements Runnable{
    Count count;
    Boolean flag;
    public Adder(Count count, Boolean flag) {
        this.count = count;
        this.flag = flag;
    }
    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
            while(!flag) {
                continue;
            }
            flag = false;
            // Lock
            System.out.println("this is adder"+count.value);
            count.value += i;
            flag = true;
            // Lock
        }
    }
}
