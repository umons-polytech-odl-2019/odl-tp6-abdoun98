package be.ac.umons;

public class Ham extends Ingredient{
    Ham(){
        super(App.ingredients.get("Ham").getName(), App.ingredients.get("Ham").getPrice());
    }
}
