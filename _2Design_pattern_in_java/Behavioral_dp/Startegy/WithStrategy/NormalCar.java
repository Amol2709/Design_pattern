package _2Design_pattern_in_java.Behavioral_dp.Startegy.WithStrategy;

public class NormalCar extends Vechile{
    public NormalCar(){
        super(new NormalDrive());
    }
    
}
