package io.dizlv.pizza;

/**
 * Base class for pizza's ingredient. Holds information about it's cost and neither it is vegetarian.
 * @author Dmitrijs Zubriks
 */
public class PizzaIngredient {

    private double cost;
    private boolean isVegetarian;

    /**
     * Constructor, initializes cost and if it is vegetarian.
     * @param cost ingredient cost.
     * @param isVegetarian is it vegetarian?
     */
    public PizzaIngredient(double cost, boolean isVegetarian) {
        this.cost = cost;
        this.isVegetarian = isVegetarian;
    }

    /**
     * Accessor method to get ingredient cost.
     * @return ingredient cost.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Mutator method to set ingredient cost.
     * @param cost new ingredient cost.
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Accessor method to check if ingredient is vegetarian.
     * @return boolean value that represents if ingredient is vegetarian.
     */
    public boolean isVegetarian() {
        return isVegetarian;
    }

    /**
     * Set vegetarian for ingredient.
     * @param isVegetarian new boolean value.
     */
    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String toString() {
        return String.format("%s[cost=%s, isVegetarian=%s]", getClass().getName(), cost, isVegetarian);
    }

}
