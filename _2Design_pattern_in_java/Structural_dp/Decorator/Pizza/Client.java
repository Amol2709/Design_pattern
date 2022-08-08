package _2Design_pattern_in_java.Structural_dp.Decorator.Pizza;

import _2Design_pattern_in_java.Structural_dp.Decorator.Pizza.AddsOn.Extracheese;
import _2Design_pattern_in_java.Structural_dp.Decorator.Pizza.AddsOn.Mushroom;

public class Client {
    public static void main(String[] args) {
       
        // Marghrita + ExtarCheese
        BasePizza pizza1 =new Extracheese(new Margherita());
        System.out.println("cost of Marghrita with Extracheese: " +pizza1.cost());


        // Marghrita + ExtarCheese+ Mushroom
        BasePizza pizza2 =new Mushroom( new Extracheese(new Margherita()));
        System.out.println("Cost of Margrita with extarcheese + Mushroom: "+pizza2.cost());
    
}
}
