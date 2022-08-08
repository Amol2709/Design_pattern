package _2Design_pattern_in_java.Structural_dp.Decorator.IceCream;

public class ChocolateCone implements IceCream{
    IceCream iceCream;

    public ChocolateCone(){}
    public ChocolateCone(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost(){
        if (this.iceCream!=null){
            return this.iceCream.getCost() + 50;
        }
        else{
            return 50;
        }

        
    }
}
