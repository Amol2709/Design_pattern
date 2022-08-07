package _2Design_pattern_in_java.Creational_dp.Builder.Second_Attempt;

public class Student {
    String name;
    String email;
    String phone;
    String pass;
    String address;
    int age;

    Student(Builder build){
        build.address = address;
        build.name = name;
        build.email = email;
    }
}
