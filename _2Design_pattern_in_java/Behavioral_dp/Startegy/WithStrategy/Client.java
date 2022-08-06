package _2Design_pattern_in_java.Behavioral_dp.Startegy.WithStrategy;

public class Client {
    public static void main(String[] args) {
        // SportsBike spbike = new SportsBike();
        // SportsCar spcar = new SportsCar();
        // NormalBike nbike = new NormalBike();
        // NormalCar ncar = new NormalCar();

        Vechile spbike = new SportsBike();
        Vechile spcar = new SportsCar();
        Vechile nbike = new NormalBike();
        Vechile ncar = new NormalCar();

        spbike.drive();
        spcar.drive();
        nbike.drive();
        ncar.drive();
    }
}
