package be.ac.umons;

import java.math.BigDecimal;

public class CarbonaraHut extends Carbonara{
    public CarbonaraHut() {
        super("Carbonara" + "Hut");

        addIngredient(new Olive());

        BigDecimal p = App.ingredients.get("Olive").getPrice();

        p.add(super.getPrice());
        setPrice(p);
    }
}
