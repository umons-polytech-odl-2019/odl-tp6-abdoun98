package be.ac.umons;

import java.math.BigDecimal;

public class ProsciuttoHut extends Prosciutto {

    public ProsciuttoHut() {

        super("Prosciutto" + "Hut");

        addIngredient(new Olive());

        BigDecimal p = App.ingredients.get("Olive").getPrice();

        p.add(super.getPrice());
        setPrice(p);

    }
}
