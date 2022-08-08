package _2Design_pattern_in_java.Creational_dp.Builder.Optimal_Solution;

class Student {
    private String name;
    private String address;
    private int age;

    private Student(){};

    private Student(Builder obj){
        this.name = obj.name;
        this.address = obj.address;
        this.age = obj.age;
    }

    public static Builder getBuilder(){
        return new Builder();
    }




    static class Builder{
        private String name;
        private String address;
        private int age;

        private Builder(){};

        public Builder setName(String name){
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

        public Student build(){
            return new Student(this);
        }
    }


}
