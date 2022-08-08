package _2Design_pattern_in_java.Creational_dp.Factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        DataBaseFactory obj = FactoryProducer.getDBaseFactory("SQL");
        obj.getDatabaseForConfigValue("postgre");
        obj.getDatabaseForConfigValue("mysql");


        DataBaseFactory obj1 = FactoryProducer.getDBaseFactory("NoSQL");
        obj1.getDatabaseForConfigValue("ArrangoDB");
        obj1.getDatabaseForConfigValue("MongoDB");

    }
}
