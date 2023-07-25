package Os.SyncAdderSubtractor;

public class Client {
    public static void main(String[] args) throws Exception {

        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

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
