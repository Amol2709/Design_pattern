package _2Design_pattern_in_java.Creational_dp.Factory.AbstractFactory;

public class FactoryProducer {
    public static DataBaseFactory getDBaseFactory(String dbType){   
        if(dbType=="SQL"){
           return new SQLDatabaseFactory() ;         
        }else{
           return new NoSQLDatabaseFactory();
        }
     }
}
