package _2Design_pattern_in_java.Creational_dp.Builder.Second_Attempt;

public class Builder {
    String name;
    String email;
    String phone;
    String pass;
    String address;
    int age;

    public Builder  setName(String name){
        this.name = name;
        return this;
    }

    public Builder setAddress(String address){
        this.address = address;
        return this;
    }

    public Builder setAge(int age){
        this.age = age;
        return this;
    }
}
