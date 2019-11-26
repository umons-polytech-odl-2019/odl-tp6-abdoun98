package be.ac.umons;

import java.math.BigDecimal;
import java.util.Iterator;

public class Carbonara extends Pizza {

    public Carbonara(String name) {
        super("Carbonara");
        addIngredient(new Dough());
        addIngredient(new WhiteCream());
        addIngredient(new Cheese());
        addIngredient(new Ham());

        Iterator<Ingredient> it = listIngredients.iterator();
        BigDecimal p = BigDecimal.valueOf(0.0);

        while(it.hasNext()) {
            p.add(it.next().getPrice());
        }

        setPrice(p);

    }
}
