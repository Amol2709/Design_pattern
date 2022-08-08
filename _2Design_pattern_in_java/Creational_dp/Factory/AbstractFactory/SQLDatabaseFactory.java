package _2Design_pattern_in_java.Creational_dp.Factory.AbstractFactory;

public class SQLDatabaseFactory extends DataBaseFactory {
    @Override
    public Database getDatabaseForConfigValue(String configValue){
        if (configValue.equals("postgre")) {
            return  new PostgreSQL();
        }

        if (configValue.equals("mysql")) {
            return new MySQLDatabase();
        }

        return null;
    }
}
