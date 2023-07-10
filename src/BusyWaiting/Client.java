package BusyWaiting;

public class Client {
    public static void main(String[] args) throws Exception {

        Count count = new Count();
        Boolean flag = true;
        Adder adder = new Adder(count, flag);
        Subtractor subtractor = new Subtractor(count, flag);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();
        System.out.println("count.value1");
        System.out.println(count.value);
        t1.join();
        System.out.println("count.value");
        System.out.println(count.value);
        t2.join();
        System.out.println("count.value2");
        System.out.println(count.value);


    }
}
