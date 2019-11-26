package be.ac.umons;

import java.math.BigDecimal;
import java.util.Iterator;

public class FruttiDiMare extends Pizza {

    public FruttiDiMare(String name) {
        super("FruttiDiMare");

        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
        addIngredient(new SeaFood());

        Iterator<Ingredient> it = listIngredients.iterator();
        BigDecimal p = BigDecimal.valueOf(0.0);

        while(it.hasNext()) {
            p.add(it.next().getPrice());
        }

        setPrice(p);
    }
}
