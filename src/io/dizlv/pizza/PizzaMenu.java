package io.dizlv.pizza;

import java.util.HashMap;
import java.util.Map;

public class PizzaMenu {

    public static void main(String[] args) {
        // Pizzas menu.
        Map<String, Pizza> pizzaMenu = new HashMap<String, Pizza>();

        // Pizzas bases.
        PizzaBase thinPizzaBase = new PizzaBase(1, PizzaBaseSize.THIN);
        PizzaBase thickPizzaBase = new PizzaBase(2, PizzaBaseSize.THICK);

        // Pizzas creation.
        Pizza margheritaPizza = new Pizza.PizzaBuilder(thinPizzaBase)
                .addTopping(new PizzaTopping(.5, true, "mozarella"))
                .addTopping(new PizzaTopping(.7, true, "tomato"))
                .addTopping(new PizzaTopping(1.2, true, "basil"))
                .build();
        pizzaMenu.put("Margherita", margheritaPizza);

        Pizza studentsPizza = new Pizza.PizzaBuilder(thinPizzaBase)
                .addTopping(new PizzaTopping(.3, true, "ketchup"))
                .addTopping(new PizzaTopping(.7, false, "sausage"))
                .addTopping(new PizzaTopping(.2, true, "garlic"))
                .build();
        pizzaMenu.put("Students", studentsPizza);

        Pizza theCarolinaPizza = new Pizza.PizzaBuilder(thinPizzaBase)
                .addTopping(new PizzaTopping(1.5, false, "chicken"))
                .addTopping(new PizzaTopping(.7, true, "onion"))
                .addTopping(new PizzaTopping(.4, true, "tomato"))
                .build();
        pizzaMenu.put("The Carolina", theCarolinaPizza);

        System.out.println("Pizza's menu:\n");

        for (Map.Entry<String, Pizza> pizzaEntry : pizzaMenu.entrySet()) {
            System.out.println(pizzaEntry.getKey() + " " + pizzaEntry.getValue().calculateCost());
        }
    }

}