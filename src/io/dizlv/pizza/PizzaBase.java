package io.dizlv.pizza;

/**
 * PizzaIngredient child. Represents PizzaBase. Holds information about it's size.
 * @author Dmitrijs Zubriks
 */
public class PizzaBase extends PizzaIngredient {

    private PizzaBaseSize pizzaBaseSize;

    /**
     * Constructor calls parents constructor and initializes base size variable.
     * Since it is pizza's base, it's vegetarian.
     * @param cost base cost.
     * @param pizzaBaseSize base size.
     */
    public PizzaBase(double cost, PizzaBaseSize pizzaBaseSize) {
        super(cost, true);
        this.pizzaBaseSize = pizzaBaseSize;
    }

    /**
     * Accessor method to get pizza's base size.
     * @return pizza's base size.
     */
    public PizzaBaseSize getPizzaBaseSize() {
        return pizzaBaseSize;
    }

    /**
     * Mutator method. Set new pizza's base size.
     * @param pizzaBaseSize enumeration that represents pizza's base size.
     */
    public void setPizzaBaseSize(PizzaBaseSize pizzaBaseSize) {
        this.pizzaBaseSize = pizzaBaseSize;
    }

    @Override
    public String toString() {
        return String.format("%s\nSize:%s", super.toString(), pizzaBaseSize);
    }
}
