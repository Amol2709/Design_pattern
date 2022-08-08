package _2Design_pattern_in_java.Structural_dp.Decorator.IceCream.addsOn;

import _2Design_pattern_in_java.Structural_dp.Decorator.IceCream.IceCream;

public class VanillaScoop implements IceCream {
    IceCream iceCream;
    public VanillaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost(){
        return this.iceCream.getCost() + 100;
    }
}
