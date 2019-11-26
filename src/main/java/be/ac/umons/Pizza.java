package be.ac.umons;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Pizza implements PizzaComponent{

    private String name;
    private BigDecimal price = BigDecimal.valueOf(0.0);  //price = 0 mais en BigDecimal
    protected ArrayList<Ingredient> listIngredients = new ArrayList<Ingredient>();

    public Pizza(String name) { this.name = name; }

    public String getName(){ return name; }

    public BigDecimal getPrice(){ return price; }

    public void setName(String n){ name = n; }

    public void setPrice(BigDecimal p){ price = p; }

    public ArrayList<Ingredient> getListIngredient(){ return listIngredients; }

    public void addIngredient(Ingredient i){ listIngredients.add(i); }

    @Override
    public String toString(){
    return super.toString();
    }
}
