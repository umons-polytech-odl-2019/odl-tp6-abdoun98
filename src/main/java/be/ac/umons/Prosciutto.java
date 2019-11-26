package be.ac.umons;

import java.math.BigDecimal;
import java.util.Iterator;

public class Prosciutto extends Pizza {

    public Prosciutto(String name) {

        super("Prosciutto");        //appelle constructeur de Pizza

        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
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
