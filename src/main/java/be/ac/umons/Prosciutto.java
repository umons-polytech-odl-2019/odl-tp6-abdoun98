package be.ac.umons;

public class Prosciutto extends Pizza {

    public Prosciutto(String name) {
        super(name);
        addIngredient(App.ingredients.get("Dough"));
    }
}
