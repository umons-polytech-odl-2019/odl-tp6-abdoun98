package be.ac.umons;

public class WhiteCream extends Ingredient {
    WhiteCream(){
        super(App.ingredients.get("White Cream").getName(), App.ingredients.get("White Cream").getPrice());
    }
}
