package _2Design_pattern_in_java.Creational_dp.SingleTon.MultiThread.Best_approach;

class Client {
    public static void main(String[] args) {
        MyClass obj1 = MyClass.getInstance();
        MyClass obj2 = MyClass.getInstance();
        MyClass obj3 = MyClass.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
   

}
