package Os.Main;

public class PrintNumber implements Runnable {
    int n;
    PrintNumber(int i){
        this.n = i;
    }
    @Override
    public void run() {
        System.out.printf("%s %d \n", Thread.currentThread().getName(), this.n);
    }
}
