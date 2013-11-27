package io.dizlv.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder pattern implementation to build pizzas with specific base.
 * Allows to add toppings to the pizza.
 * @author Dmitrijs Zubriks
 */
public class PizzaBuilder {

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
//    public Pizza build() {
//        return new Pizza(this);
//    }

}