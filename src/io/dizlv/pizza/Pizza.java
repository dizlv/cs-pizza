package io.dizlv.pizza;

import java.util.ArrayList;
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
     * Builder pattern implementation to build pizzas with specific base.
     * Allows to add toppings to the pizza.
     */
    public static class PizzaBuilder {

        // Required parameters.
        private final PizzaBase pizzaBase;

        // Optional parameters.
        private List<PizzaTopping> pizzaToppings = new ArrayList<PizzaTopping>();

        /**
         * Accessor method to get pizza's base.
         * @return PizzaBase instance.
         */
        public PizzaBase getPizzaBase() {
            return pizzaBase;
        }

        /**
         * Accessor method to get pizza's toppings.
         * @return List<PizzaTopping> instance.
         */
        public List<PizzaTopping> getPizzaToppings() {
            return pizzaToppings;
        }

        /**
         * Constructor that initializes required parameters for the pizza.
         * @param pizzaBase pizza's base.
         */
        public PizzaBuilder(PizzaBase pizzaBase) {
            this.pizzaBase = pizzaBase;
        }

        /**
         * Adds new topping to the toppings list.
         * @param pizzaTopping PizzaTopping instance.
         * @return link on the current PizzaBuilder object.
         */
        public PizzaBuilder addTopping(PizzaTopping pizzaTopping) {
            pizzaToppings.add(pizzaTopping);

            return this;
        }

        /**
         * Builds Pizza object.
         * @return new Pizza instance.
         */
        public Pizza build() {
            return new Pizza(this);
        }

    }

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
        return String.format("%s[pizzaBase=%s, pizzaToppings=%s]", getClass().getName(), pizzaBase, pizzaToppings);
    }

}
