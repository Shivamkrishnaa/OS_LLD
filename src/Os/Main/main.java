package Os.Main;

public class main {
    public static void main(String args[]) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            PrintNumber p = new PrintNumber(i);
            Thread t = new Thread(p);
            t.start();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
