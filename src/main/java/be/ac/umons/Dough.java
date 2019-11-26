package be.ac.umons;

public class Dough extends Ingredient{
    Dough() {
        super(App.ingredients.get("Dough").getName(), App.ingredients.get("Dough").getPrice());
    }
}
