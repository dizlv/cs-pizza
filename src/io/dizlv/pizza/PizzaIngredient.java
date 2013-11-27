package io.dizlv.pizza;

/**
 *
 */
public class PizzaIngredient {

    private double cost;
    private boolean isVegetarian;

    public PizzaIngredient(double cost, boolean isVegetarian) {
        this.cost = cost;
        this.isVegetarian = isVegetarian;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String toString() {
        return String.format("%s[cost=%s, isVegetarian=%s]", getClass().getName(), cost, isVegetarian);
    }

}
