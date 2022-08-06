package _2Design_pattern_in_java.Behavioral_dp.Startegy.WithStrategy;

public class SportsBike extends Vechile {
    public SportsBike(){
        super(new SpecialDrive());
    }
}
