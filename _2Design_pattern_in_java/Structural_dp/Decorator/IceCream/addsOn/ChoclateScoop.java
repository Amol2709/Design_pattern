package _2Design_pattern_in_java.Structural_dp.Decorator.IceCream.addsOn;

import _2Design_pattern_in_java.Structural_dp.Decorator.IceCream.IceCream;

public class ChoclateScoop implements IceCream {
    IceCream iceCream;
    public ChoclateScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost(){
        return this.iceCream.getCost() + 130;
    }
}
