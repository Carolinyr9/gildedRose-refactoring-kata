package com.gildedrose;

public class Item {

    public String name;
    public int sellIn; // informa o número de dias que temos para vender o item
    public int quality; // informa o quão valioso é o item

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
