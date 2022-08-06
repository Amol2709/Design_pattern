package _2Design_pattern_in_java.Behavioral_dp.Startegy.WithStrategy;

public class NormalBike extends Vechile {
    public NormalBike(){
        super(new NormalDrive());
    }
}
