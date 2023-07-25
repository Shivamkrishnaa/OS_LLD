package Solid.SOLID_7_FACTORY;

public class MySqlDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("MySqlDatabase Database connecting...");
    }

    @Override
    public void disconnect() {
        System.out.println("MySqlDatabase Database disconnecting...");
    }

    @Override
    public void query() {
        System.out.println("MySqlDatabase Database querying...");
    }
}
