package _2Design_pattern_in_java.Creational_dp.Factory.AbstractFactory;

public class MySQLDatabase implements Database {
    @Override
    public String getUrl(){
        return null;
    }

    @Override
    public int getConnectionLimit(){
        return 0;
    }

    @Override
    public String getDescriptor(){
        return null;
    }

}
