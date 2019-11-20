package be.ac.umons;

import java.math.BigDecimal;
import java.util.Observer;

public class Ingredient implements PizzaComponent{
    private String name;
    private BigDecimal price;

    public Ingredient() {}

   public Ingredient(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public BigDecimal getPrice() { return price; }

    public void setName(String name) { this.name = name; }

    public void setPrice(BigDecimal price) { this.price = price; }

    public String toString(){ return super.toString();}

    /*public void registerObserver(Observer o){}

    public void unregisterObserver(Observer o){}

    public void notifyObserver(){}*/

}
