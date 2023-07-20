package SOLID_7_FACTORY;

public class MyRedisDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("MyRedisDatabase Database connecting...");
    }

    @Override
    public void disconnect() {
        System.out.println("MyRedisDatabase Database disconnecting...");
    }

    @Override
    public void query() {
        System.out.println("MyRedisDatabase Database querying...");
    }
}
