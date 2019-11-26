package be.ac.umons;

import java.math.BigDecimal;
import java.util.Iterator;

public class Margherita extends Pizza {

    public Margherita(String name) {

        super("Margherita");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());

        Iterator<Ingredient> it = listIngredients.iterator();
        BigDecimal p = BigDecimal.valueOf(0.0);

        while(it.hasNext()) {
            p.add(it.next().getPrice());
        }

        setPrice(p);
    }

}
