package io.dizlv.pizza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PizzaMenu {

    public static void main(String[] args) {
        // Pizzas menu.
        Map<String, Pizza> pizzaMenu = new HashMap<String, Pizza>();

        // Pizzas bases.
        PizzaBase thinPizzaBase = new PizzaBase(1, PizzaBaseSize.THIN);
        PizzaBase thickPizzaBase = new PizzaBase(2, PizzaBaseSize.THICK);

        // Pizzas creation.
        Pizza margheritaPizza = new PizzaBuilder(thinPizzaBase)
                .addTopping(new PizzaTopping(.5, true, "mozarella"))
                .addTopping(new PizzaTopping(.7, true, "tomato"))
                .addTopping(new PizzaTopping(1.2, true, "basil"))
                .build();
        pizzaMenu.put("Margherita", margheritaPizza);

        Pizza studentsPizza = new PizzaBuilder(thinPizzaBase)
                .addTopping(new PizzaTopping(.3, true, "ketchup"))
                .addTopping(new PizzaTopping(.7, false, "sausage"))
                .addTopping(new PizzaTopping(.2, true, "garlic"))
                .build();
        pizzaMenu.put("Students", studentsPizza);

        Pizza theCarolinaPizza = new PizzaBuilder(thinPizzaBase)
                .addTopping(new PizzaTopping(1.5, false, "chicken"))
                .addTopping(new PizzaTopping(.7, true, "onion"))
                .addTopping(new PizzaTopping(.4, true, "tomato"))
                .build();
        pizzaMenu.put("The Carolina", theCarolinaPizza);

        // Print pizzas menu.
        System.out.println("Pizza's menu:\n");

        for (Map.Entry<String, Pizza> pizzaEntry : pizzaMenu.entrySet()) {
            System.out.println(pizzaEntry.getKey() + " " + pizzaEntry.getValue().calculateCost());
        }

        // Read input and show report.
        Scanner in = new Scanner(System.in);

        System.out.println("Chose pizza:");

        String input = in.nextLine();
        Pizza pizza = pizzaMenu.get(input);

        if (pizza == null) {
            System.out.println("No such pizza in menu.");
        } else {
            System.out.println(pizza);
        }

    }

}