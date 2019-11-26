package be.ac.umons;

public class SeaFood extends Ingredient {
    SeaFood(){
        super(App.ingredients.get("Sea Food").getName(), App.ingredients.get("Sea Food").getPrice());
    }
}
