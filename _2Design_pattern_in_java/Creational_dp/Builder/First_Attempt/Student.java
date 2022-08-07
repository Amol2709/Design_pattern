package _2Design_pattern_in_java.Creational_dp.Builder.First_Attempt;

import java.util.Map;

public class Student {
    String name;
    String email;
    String phone;
    String pass;
    String address;
    int age;

    public Student(Map<ParaMeterValues, Object> map) {
        this.address = (String )map.get(ParaMeterValues.address);
        this.name = (String)map.get(ParaMeterValues.name);
        this.age = (Integer)map.get(ParaMeterValues.age);
        
    }
}
