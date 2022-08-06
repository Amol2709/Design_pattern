package _2Design_pattern_in_java.Behavioral_dp.Startegy.WithStrategy;

public class SportsCar extends Vechile {
    public SportsCar(){
        super(new SpecialDrive());
    }
}
