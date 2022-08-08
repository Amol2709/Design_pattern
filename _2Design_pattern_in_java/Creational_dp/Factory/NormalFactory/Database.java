package _2Design_pattern_in_java.Creational_dp.Factory.NormalFactory;

public interface Database {
    public int getConnectionLimit();
    public String getDescriptor();
    public String getUrl();
}
