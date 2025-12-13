package com.example.structuralpatterns.decorator;

public class PizzaShop {
    
    public static void main(String[] args) {

        BasePizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.getDescription() + " Cost: " + plainPizza.getCost()); 

        BasePizza mushroomTandooriDelightPizza = new Mushroomtopping(new TandooriPaneerDelight());
        System.out.println(mushroomTandooriDelightPizza.getDescription() + " Cost: " + mushroomTandooriDelightPizza.getCost()); 

        BasePizza chickenPepperonitExtraCheezePizza = new Pepperonitopping(new ExtraCheezetopping(new ChickenDominator()));

        System.out.println(chickenPepperonitExtraCheezePizza.getDescription() + " Cost: " + chickenPepperonitExtraCheezePizza.getCost());
    }
}
