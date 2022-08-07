package _2Design_pattern_in_java.Creational_dp.SingleTon.UsingEnum;

class Client {
    public static void main(String[] args) {
        
        MyClass obj1 = MyClass.INSTANCE;
        MyClass obj2 = MyClass.INSTANCE;
        System.out.println(obj1);
        System.out.println(obj2);
    }
   

}
