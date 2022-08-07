package _2Design_pattern_in_java.Creational_dp.Builder.Initial_Attempt;

public class Student {
    String name;
    String email;
    String phone;
    String pass;
    String address;
    int age;

    public Student(String name,
            String email,
            String phone,
            String pass,
            String address,
            int age
            ) {
        this.address = address;
        this.name = name;
        this.age = age;
        this.pass = pass;
        this.email = email;
    }
}
