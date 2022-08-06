package _2Design_pattern_in_java.Behavioral_dp.Startegy.withoutStrategy;

public class Client {
    public static void main(String[] args) {
        SportsBike spbike = new SportsBike();
        SportsCar spcar = new SportsCar();
        NormalBike nbike = new NormalBike();
        NormalCar ncar = new NormalCar();

        spbike.drive();
        spcar.drive();
        nbike.drive();
        ncar.drive();


    }
}
