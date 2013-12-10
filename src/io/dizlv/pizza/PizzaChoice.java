package io.dizlv.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaChoice {

    /**
     * Get pizzas base.
     * @return pizza's base.
     */
    public PizzaBase getPizzaBaseInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose pizza base [1 - thin, 2 - thick]:");
        int pizzaBaseIndex = in.nextInt();

        switch (pizzaBaseIndex) {
            case 1:
                return new PizzaBase(1, PizzaBaseSize.THIN);
            case 2:
                return new PizzaBase(2, PizzaBaseSize.THICK);
            default:
                return null;
        }
    }

    /**
     * Get pizzas toppings from user input.
     * @return pizzas toppings.
     */
    public List<PizzaTopping> getPizzaToppingsInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Add some toppings.");
        List<PizzaTopping> pizzaToppings = new ArrayList<PizzaTopping>();

        while (true) {
            System.out.println("Topping cost:");
            float toppingCost = in.nextFloat();

            System.out.println("Topping name:");
            String toppingName = in.next();

            System.out.println("Is vegetariable?");
            boolean isVegetariable = in.nextBoolean();

            PizzaTopping pizzaTopping = new PizzaTopping(toppingCost, isVegetariable, toppingName);
            pizzaToppings.add(pizzaTopping);

            System.out.println("Add more toppings?[y,n]");
            if (in.next().toLowerCase().equals("n")) {
                break;
            }
        }

        return pizzaToppings;
    }

    public static void main(String[] args) {
        PizzaChoice pizzaChoice = new PizzaChoice();

        PizzaBase pizzaBase = pizzaChoice.getPizzaBaseInput();

        if (pizzaBase == null) {
            System.out.println("Pizza Base is wrong.");
            System.exit(1);
        }

        PizzaBuilder pizzaBuilder = new PizzaBuilder(pizzaBase);
        List<PizzaTopping> pizzaToppings = pizzaChoice.getPizzaToppingsInput();

        for (PizzaTopping pizzaTopping : pizzaToppings) {
            pizzaBuilder.addTopping(pizzaTopping);
        }

        Pizza pizza = pizzaBuilder.build();
        System.out.println("Pizza's cost: " + pizza.calculateCost());
        System.out.println(pizza);
    }

}
