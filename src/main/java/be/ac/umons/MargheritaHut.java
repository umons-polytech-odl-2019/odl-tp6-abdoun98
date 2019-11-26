package be.ac.umons;

import java.math.BigDecimal;
import java.util.Iterator;

public class MargheritaHut extends Margherita {

    public MargheritaHut() {
        super("Margherita" + "Hut");

        addIngredient(new Olive());
        BigDecimal p = App.ingredients.get("Olive").getPrice();

        p.add(super.getPrice());    //recupere de le getPrice de Margherita
        setPrice(p);


                /*Iterator<Ingredient> it = listIngredients.iterator();
        BigDecimal p = BigDecimal.valueOf(0.0);

        while(it.hasNext()) {
            p.add(it.next().getPrice());
        }
        setPrice(p);*/
    }
}
