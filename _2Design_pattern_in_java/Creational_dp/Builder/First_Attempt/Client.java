package _2Design_pattern_in_java.Creational_dp.Builder.First_Attempt;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Map<ParaMeterValues, Object> map = new HashMap<>();
        map.put(ParaMeterValues.name, "Amol");
        map.put(ParaMeterValues.age, 26);
        map.put(ParaMeterValues.address, "abcd");

        Student obj = new Student(map);
    }
}
