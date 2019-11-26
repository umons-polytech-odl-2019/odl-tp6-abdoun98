package be.ac.umons;

public class Mushroom extends Ingredient {
    Mushroom(){
        super(App.ingredients.get("Mushroom").getName(), App.ingredients.get("Mushroom").getPrice());
    }
}
