package _2Design_pattern_in_java.Creational_dp.SingleTon.MultiThread.Best_approach;

class MyClass {
    public static MyClass isInstance = null;
    private MyClass(){}

    public static MyClass getInstance(){
        if (isInstance == null){
            synchronized(MyClass.class){
                if (isInstance == null){
                    isInstance = new MyClass();
                }
            }
            
        }
        return isInstance;
    }
}
