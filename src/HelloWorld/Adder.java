package HelloWorld;

public class Adder implements Runnable{
    Count count;
    public Adder(Count c) {
        this.count = c;
    }
    public void run() {
        for(int i=0; i<5000; i++){
            System.out.println("Adder : i = " + i + ", value =" + count.value);
            count.value += i;
        }
    }
}
