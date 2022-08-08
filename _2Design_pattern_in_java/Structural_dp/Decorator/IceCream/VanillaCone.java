package _2Design_pattern_in_java.Structural_dp.Decorator.IceCream;

public class VanillaCone implements IceCream {
    IceCream iceCream;
    public VanillaCone(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost(){
        if (this.iceCream!=null){
            return this.iceCream.getCost() + 30;
        }
        else{
            return 30;
        }
        
    }
}
