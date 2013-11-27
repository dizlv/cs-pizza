package io.dizlv.pizza;

public class PizzaTopping extends PizzaIngredient {

    private String name;

    public PizzaTopping(double cost, boolean isVegetarian, String name) {
        super(cost, isVegetarian);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s[name=%s]", super.toString(), name);
    }

}
