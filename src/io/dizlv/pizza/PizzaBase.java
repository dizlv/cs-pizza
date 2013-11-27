package io.dizlv.pizza;

public class PizzaBase extends PizzaIngredient {

    private PizzaBaseSize pizzaBaseSize;

    public PizzaBase(double cost, PizzaBaseSize pizzaBaseSize) {
        super(cost, true);
        this.pizzaBaseSize = pizzaBaseSize;
    }

    public PizzaBaseSize getPizzaBaseSize() {
        return pizzaBaseSize;
    }

    public void setPizzaBaseSize(PizzaBaseSize pizzaBaseSize) {
        this.pizzaBaseSize = pizzaBaseSize;
    }

    @Override
    public String toString() {
        return String.format("%s[pizzaBaseSize=%s]", super.toString(), pizzaBaseSize);
    }
}
