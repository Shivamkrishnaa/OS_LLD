package HelloWorld;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws Exception{

        HelloWorld h = new HelloWorld();
        Thread t = new Thread(h);
        t.start();

        Count c = new Count();
        Adder a = new Adder(c);
        Substractor s = new Substractor(c);
        Thread at = new Thread(a);
        Thread st = new Thread(s);
        at.start();
        st.start();
        st.join();
        at.join();
        System.out.println(c.value);


    }
}
