package be.ac.umons;

public class TomatoSauce extends Ingredient {
    TomatoSauce(){
        super(App.ingredients.get("Tomato Sauce").getName(), App.ingredients.get("Tomato Sauce").getPrice());
    }
}
