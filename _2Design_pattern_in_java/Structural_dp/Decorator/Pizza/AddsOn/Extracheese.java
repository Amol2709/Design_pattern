package _2Design_pattern_in_java.Structural_dp.Decorator.Pizza.AddsOn;

import _2Design_pattern_in_java.Structural_dp.Decorator.Pizza.BasePizza;

public class Extracheese extends BasePizza{
    BasePizza bPizza;
    public Extracheese(BasePizza basePizza){
        this.bPizza = basePizza;
    }
    @Override
    public int cost(){
        return  this.bPizza.cost()+10;
    }
}
