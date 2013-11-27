package io.dizlv.pizza;

public class PizzaBuild {

    public static void main(String[] args) {
        PizzaBase pizzaBase = new PizzaBase(2, PizzaBaseSize.THICK);
        Pizza pizza = new Pizza.PizzaBuilder(pizzaBase)
                .addTopping(new PizzaTopping(.5, true, "onions"))
                .addTopping(new PizzaTopping(.7, true, "cheese"))
                .addTopping(new PizzaTopping(1.2, false, "bacon"))
                .addTopping(new PizzaTopping(.9, true, "pineapple"))
                .build();

        System.out.println(pizza.calculateCost());
        System.out.println(pizza);
    }

}
