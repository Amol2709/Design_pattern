package _2Design_pattern_in_java.Behavioral_dp.Startegy.WithStrategy;

import _2Design_pattern_in_java.Behavioral_dp.Startegy.WithStrategy.interfaces.DriveStrategy;

public class SpecialDrive implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Special Driving Behaviour");
    }
    
}
