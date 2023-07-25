package Os.HelloWorld;

public class HelloWorld implements Runnable{
    @Override
    public void run() {
        System.out.println("HELLO WORLD:" + Thread.currentThread().getName());
    }
}
