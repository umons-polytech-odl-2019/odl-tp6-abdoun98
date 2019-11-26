package be.ac.umons;

import java.math.BigDecimal;

public class FruttiDiMareHut extends FruttiDiMare {
    public FruttiDiMareHut() {
        super("FruttiDiMare" + "Hut");

        addIngredient(new Olive());

        BigDecimal p = App.ingredients.get("Olive").getPrice();

        p.add(super.getPrice());
        setPrice(p);
    }
}
