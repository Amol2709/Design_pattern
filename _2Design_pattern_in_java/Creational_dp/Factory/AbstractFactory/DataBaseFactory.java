package _2Design_pattern_in_java.Creational_dp.Factory.AbstractFactory;

public abstract class DataBaseFactory {
    public abstract Database getDatabaseForConfigValue(String configValue);
}
