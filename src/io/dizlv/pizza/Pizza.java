package io.dizlv.pizza;

import java.util.List;

/**
 * Represents information about pizza object: base and toppings.
 * For building implemented Builder pattern (Josh Bloch version).
 *
 * @author Dmitrijs Zubriks
 */
public class Pizza {

    private PizzaBase pizzaBase;
    private List<PizzaTopping> pizzaToppings;

    /**
     * Constructor to initialize object with values from builder.
     * @param pizzaBuilder builder pattern instance.
     */
    public Pizza(PizzaBuilder pizzaBuilder) {
        pizzaBase = pizzaBuilder.getPizzaBase();
        pizzaToppings = pizzaBuilder.getPizzaToppings();
    }

    /**
     * Calculates total cost of base and sum of all toppings.
     * @return total pizza's cost.
     */
    public double calculateCost() {
        double summ = 0.0;

        summ += pizzaBase.getCost();
        for (PizzaTopping pizzaTopping : pizzaToppings) {
            summ += pizzaTopping.getCost();
        }

        return summ;
    }

    /**
     * Checks if pizza is vegetarian or not. Base is always vegetarian, so it checks all toppings.
     * @return boolean value that represents if the pizza is vegetarian or not.
     */
    public boolean isVegetarian() {
        for (PizzaTopping topping : pizzaToppings) {
            if (!topping.isVegetarian()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return String.format("Pizza Base\n%s, \n\nPizzaToppings\n%s", pizzaBase, pizzaToppings);
    }

}
