package SOLID_2_Singleton;

public class Client {
    public static void main(String[] args) {
        Database d = Database.getConnection();
        for(int i=0; i<1000000; i++) {
            Thread t = new Thread(d);
            t.run();
        }

    }
}
