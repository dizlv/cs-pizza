package io.dizlv.pizza;

/**
 * Represents pizza's topping. Holds information about name.
 * @author Dmitrijs Zubriks
 */
public class PizzaTopping extends PizzaIngredient {

    private String name;

    /**
     * Constructor. Initializes variables with values.
     * @param cost ingredient cost.
     * @param isVegetarian is it vegetarian?
     * @param name ingredient name.
     */
    public PizzaTopping(double cost, boolean isVegetarian, String name) {
        super(cost, isVegetarian);
        this.name = name;
    }

    /**
     * Accessor method to get ingredient name.
     * @return ingredient name.
     */
    public String getName() {
        return name;
    }

    /**
     * Mutator method to set ingredients new name.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s\nName:%s\n", super.toString(), name);
    }

}
