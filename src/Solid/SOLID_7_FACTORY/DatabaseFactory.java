package Solid.SOLID_7_FACTORY;

public class DatabaseFactory {
    public static Database createDatabase(String type) {
        switch (type) {
            case "mysql":
                return new MySqlDatabase();
            default:
                return new MyRedisDatabase();
        }
    }
}
