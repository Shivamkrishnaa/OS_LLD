package Solid.SOLID_7_FACTORY;

public class Client {
    public static void main(String[] args) {
        Database d = DatabaseFactory.createDatabase("mysql");
        d.connect();
        d.query();
        d.disconnect();
        Database r = DatabaseFactory.createDatabase("");
        r.connect();
        r.query();
        r.disconnect();
    }
}
