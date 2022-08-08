package _2Design_pattern_in_java.Creational_dp.Factory.AbstractFactory;

public class NoSQLDatabaseFactory extends DataBaseFactory{
    @Override
    public Database getDatabaseForConfigValue(String configValue){
        if (configValue.equals("ArrangoDB")) {
            return  new ArrangoDB();
        }

        if (configValue.equals("MongoDB")) {
            return new MonoDB();
        }

        return null;
    }
}
