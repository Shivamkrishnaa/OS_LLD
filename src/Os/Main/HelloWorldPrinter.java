package Os.Main;

public class HelloWorldPrinter implements Runnable {
    int number;
    HelloWorldPrinter(int number) {
        this.number = number;
    }
    @Override
    public  void run() {
        System.out.printf("%d %s \n", this.number, Thread.currentThread().getName());
        System.out.println();
    }
}
