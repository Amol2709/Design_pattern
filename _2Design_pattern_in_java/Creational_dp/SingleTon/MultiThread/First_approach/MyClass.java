package _2Design_pattern_in_java.Creational_dp.SingleTon.MultiThread.First_approach;

class MyClass {
    public static MyClass isInstance = null;
    private MyClass(){}

    synchronized public static MyClass getInstance(){
        if (isInstance == null){
            isInstance = new MyClass();
        }
        return isInstance;
    }
}
