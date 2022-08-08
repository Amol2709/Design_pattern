package _2Design_pattern_in_java.Structural_dp.Decorator.IceCream;

import _2Design_pattern_in_java.Structural_dp.Decorator.IceCream.addsOn.ChoclateScoop;
import _2Design_pattern_in_java.Structural_dp.Decorator.IceCream.addsOn.VanillaScoop;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream1 =  new ChoclateScoop(new ChocolateCone()) ;
        System.out.println("Cost of choclate cone + choc scoop : "+ iceCream1.getCost());

        IceCream iceCream2 =  new VanillaScoop(new ChocolateCone()) ;
        System.out.println("Cost of choclate cone + choc scoop : "+ iceCream2.getCost());


        IceCream iceCream3=   new VanillaScoop(new ChoclateScoop(new ChocolateCone()))  ;
        System.out.println("Cost of choclate cone + choc scoop : "+ iceCream3.getCost());
    }
}
