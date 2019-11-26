package be.ac.umons;

public class Olive extends Ingredient {
    Olive(){
        super(App.ingredients.get("Olive").getName(), App.ingredients.get("Olive").getPrice());
    }
}
