package io.dizlv.pizza;

public class PizzaBuild {

    public static void main(String[] args) {
        PizzaBase pizzaBase = new PizzaBase(2, PizzaBaseSize.THICK);
        Pizza pizza = new PizzaBuilder(pizzaBase)
                .addTopping(new PizzaTopping(.5, true, "onions"))
                .addTopping(new PizzaTopping(.7, true, "cheese"))
                .addTopping(new PizzaTopping(1.2, true, "bacon"))
                .addTopping(new PizzaTopping(.9, true, "pineapple"))
                .build();

        System.out.println("Total cost:" + pizza.calculateCost());
        System.out.println("Vegetarian:" + pizza.isVegetarian());
        System.out.println();
        System.out.println(pizza);
    }

}
