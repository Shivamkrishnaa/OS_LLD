package SOLID_2_Singleton;

public class Database implements Runnable{
    private static Database db_connection = null;
    private Object Database() {
        return new Object();
    }
    public static Database getConnection(){
        synchronized(db_connection) {
            if (db_connection != null) {
                db_connection = new Database();
            }
            return db_connection;
        }

    }

    @Override
    public void run() {
        getConnection();
    }
}
