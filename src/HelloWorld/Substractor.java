package HelloWorld;

public class Substractor implements Runnable{
    Count count;
    public Substractor(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=0; i<5000; i++){
            count.value -= i;
            System.out.println("Substractor : i = " + i + ", value =" + count.value);
        }
    }

}
