package _2Design_pattern_in_java.Creational_dp.Builder.Second_Attempt;

public class Client {
    public static void main(String[] args) {
        Builder build = new Builder();
        build.setName("Amol").setAddress("abcdfg").setAge(26);

        Student obj = new Student(build);
    }
    
    
}
