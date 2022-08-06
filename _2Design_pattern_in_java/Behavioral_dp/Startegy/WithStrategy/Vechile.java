package _2Design_pattern_in_java.Behavioral_dp.Startegy.WithStrategy;

import _2Design_pattern_in_java.Behavioral_dp.Startegy.WithStrategy.interfaces.DriveStrategy;

public class Vechile {
    DriveStrategy driveStrategy;
    public Vechile(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
