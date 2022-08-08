package _2Design_pattern_in_java.Creational_dp.Factory.NormalFactory;

public class DataBaseFactory {
    public static Database getDatabaseForConfigValue(String configValue) {
        if (configValue.equals("postgre")) {
            return  new PostgreSQL();
        }

        if (configValue.equals("mysql")) {
            return new MySQLDatabase();
        }

        return null;
    }
}
