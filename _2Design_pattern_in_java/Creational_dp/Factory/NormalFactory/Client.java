package _2Design_pattern_in_java.Creational_dp.Factory.NormalFactory;

public class Client {
    public static void main(String[] args) {
        String databaseConfig = "postgre";
        Database db = DataBaseFactory.getDatabaseForConfigValue(databaseConfig);
    }
}
