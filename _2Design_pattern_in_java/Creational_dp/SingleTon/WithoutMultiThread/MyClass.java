package _2Design_pattern_in_java.Creational_dp.SingleTon.WithoutMultiThread;

class MyClass {
    public static MyClass isInstance = null;
    private MyClass(){}

    public static MyClass getInstance(){
        if (isInstance == null){
            isInstance = new MyClass();
        }
        return isInstance;
    }
}
