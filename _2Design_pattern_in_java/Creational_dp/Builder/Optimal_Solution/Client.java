package _2Design_pattern_in_java.Creational_dp.Builder.Optimal_Solution;

public class Client {
    public static void main(String[] args) {
        Student obj = Student.getBuilder().setName("Amol")
                                .setAddress("ABCD")
                                .setAge(26).build();
    }
}
